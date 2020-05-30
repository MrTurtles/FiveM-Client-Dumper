package com.github.marcodsl.utils

import java.util.*

fun String.toPlainText(): String {
    val bytes = Base64.getMimeDecoder().decode(this)
    return String(bytes)
}

fun String.base64ToByteArray(): ByteArray = Base64.getMimeDecoder().decode(this)