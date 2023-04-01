package it.giaquinto.marvelcharacters.data.utils

import java.math.BigInteger
import java.security.MessageDigest



fun String.toMD5(messageDigest: MessageDigest): String =
    BigInteger(1, messageDigest.digest(this.toByteArray())).toString(16).padStart(32, '0')