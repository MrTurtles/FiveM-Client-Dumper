package com.github.marcodsl.utils

import com.google.gson.Gson

inline fun <reified T> Gson.fromJson(json: String): T {
    return this.fromJson(json, T::class.java)
}