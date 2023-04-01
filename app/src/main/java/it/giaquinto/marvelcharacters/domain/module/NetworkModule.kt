package it.giaquinto.marvelcharacters.domain.module

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
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient = with(OkHttpClient.Builder()) {
        connectTimeout(TIMEOUT, TimeUnit.MINUTES)
        readTimeout(TIMEOUT, TimeUnit.MINUTES)
        writeTimeout(TIMEOUT, TimeUnit.MINUTES)

        addInterceptor { chain ->
            val ts = System.currentTimeMillis()
            with(chain) {
                proceed(
                    request()
                        .newBuilder()
                        .url(
                            request()
                                .url
                                .newBuilder()
                                .addQueryParameter("ts", ts.toString())
                                .addQueryParameter("apikey", BuildConfig.PUBLIC_KEY)
                                .addQueryParameter(
                                    "hash",
                                    "$ts${BuildConfig.PRIVATE_KEY}${BuildConfig.PUBLIC_KEY}".toMD5(
                                        MessageDigest.getInstance("MD5")
                                    )
                                )
                                .build()
                        )
                        .build()
                )
            }
        }

        if (BuildConfig.DEBUG) {
            addInterceptor(
                HttpLoggingInterceptor(
                    HttpLoggingInterceptor.Logger.DEFAULT
                )
                    .setLevel(HttpLoggingInterceptor.Level.BODY)
            )
        }

        build()
    }

    @Provides
    @Singleton
    fun provideRetrofitClient(httpClient: OkHttpClient): Retrofit = with(Retrofit.Builder()) {
        baseUrl(BASE_URL)
        client(httpClient)
        addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder().create()
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
        private const val TIMEOUT = 1L
        private const val BASE_URL = "https://gateway.marvel.com/v1/public/"
        private const val PUBLIC_KEY = "323934a0c171cb0a0140ede93dd4e52d"

    }
}