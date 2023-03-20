package it.giaquinto.marvelcharacters.domain.module

import android.util.Log
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.giaquinto.marvelcharacters.BuildConfig
import it.giaquinto.marvelcharacters.data.service.*
import it.giaquinto.marvelcharacters.data.utils.toMD5
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.MessageDigest
import java.sql.Timestamp
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient = with(OkHttpClient.Builder()) {
        connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        readTimeout(TIMEOUT, TimeUnit.SECONDS)
        writeTimeout(TIMEOUT, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG) {
            addInterceptor(
                HttpLoggingInterceptor { message ->
                    Log.d(
                        "MARVEL-HTTP-LOG",
                        message
                    )
                }.apply {
                    setLevel(HttpLoggingInterceptor.Level.HEADERS)
                    setLevel(HttpLoggingInterceptor.Level.BODY)
                }
            )
        }

        // TODO API-KEY INTERCEPTOR ???

        build()
    }

    @Provides
    @Singleton
    fun provideRetrofitClient(httpClient: OkHttpClient): Retrofit = with(Retrofit.Builder()) {
        baseUrl(BASE_URL)
        client(httpClient)
        addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder().setLenient().create()
            )
        ) // TODO Verify if strictly mode it's possible to use
        build()
    }

    @Provides
    @Singleton
    fun provideStoriesService(retrofit: Retrofit): StoriesApiService =
        retrofit.create(StoriesApiService::class.java)

    @Provides
    @Singleton
    fun provideCharactersRemoteService(retrofit: Retrofit): CharactersApiService =
        retrofit.create(CharactersApiService::class.java)

    @Provides
    @Singleton
    fun provideComicsRemoteService(retrofit: Retrofit): ComicsApiService =
        retrofit.create(ComicsApiService::class.java)

    @Provides
    @Singleton
    fun provideCreatorsRemoteService(retrofit: Retrofit): CreatorsApiService =
        retrofit.create(CreatorsApiService::class.java)

    @Provides
    @Singleton
    fun provideEventsRemoteService(retrofit: Retrofit): EventsApiService =
        retrofit.create(EventsApiService::class.java)

    @Provides
    @Singleton
    fun provideSeriesRemoteService(retrofit: Retrofit): SeriesApiService =
        retrofit.create(SeriesApiService::class.java)


    companion object {
        private const val PRIVATE_KEY = "d6008378f8ccbe2db6200a1fdb9ee921d1f99ce7"
        private const val TIMEOUT = 20L

        private const val limit = "20"
        private val md by lazy { MessageDigest.getInstance("MD5") }
        private val baseHash: String
            get() = "$timeStamp$PRIVATE_KEY$PUBLIC_KEY"

        const val BASE_URL = "https://gateway.marvel.com:443/v1/public/"
        const val PUBLIC_KEY = "323934a0c171cb0a0140ede93dd4e52d"
        val timeStamp by lazy { Timestamp(System.currentTimeMillis()).time }

        fun apiHash(): String = baseHash.toMD5(md)
    }
}