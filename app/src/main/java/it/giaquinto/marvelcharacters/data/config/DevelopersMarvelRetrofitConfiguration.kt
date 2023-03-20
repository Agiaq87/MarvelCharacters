package it.giaquinto.marvelcharacters.data.config

import it.giaquinto.marvelcharacters.data.utils.toMD5
import java.security.MessageDigest
import java.sql.Timestamp

object DevelopersMarvelRetrofitConfiguration {

    private const val PRIVATE_KEY = "d6008378f8ccbe2db6200a1fdb9ee921d1f99ce7"


    private const val limit = "20"
    private val md by lazy { MessageDigest.getInstance("MD5") }
    private val baseHash: String
        get() = "$timeStamp$PRIVATE_KEY$PUBLIC_KEY"

    const val BASE_URL = "https://gateway.marvel.com:443/v1/public/"
    const val PUBLIC_KEY = "323934a0c171cb0a0140ede93dd4e52d"
    val timeStamp by lazy { Timestamp(System.currentTimeMillis()).time }

    fun apiHash(): String = baseHash.toMD5(md)
}