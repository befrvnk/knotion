package com.befrvnk.knotion.objects

import kotlinx.serialization.Serializable

@Serializable
@JvmInline
value class Id(val uuid: String)

//@Serializable
//@JvmInline
//value class Url(val value: String)

@Serializable
@JvmInline
value class Email(val value: String)

@JvmInline
value class NotionUrl(val url: String) {
    val id get() = url.takeLastWhile { it != '-' }
}