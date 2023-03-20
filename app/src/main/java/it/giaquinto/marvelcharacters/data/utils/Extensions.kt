package it.giaquinto.marvelcharacters.data.utils

import java.security.MessageDigest

/*fun ByteArray.toHex(): String {
    return joinToString { "%02x".format(it) }
}*/

fun String.toMD5(messageDigest: MessageDigest): String =
    messageDigest.digest(toByteArray()).joinToString { "%02x".format(it) }