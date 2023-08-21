package com.befrvnk.knotion.objects.richtext

import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("mention")
data class Mention(
    override val annotations: Annotations,
    @JsonNames("plain_text")
    override val plainText: String,
    override val href: String? = null,
    val mention: MentionDetails,
) : RichText() {
    @Serializable
    sealed class MentionDetails {

        @Serializable
        @SerialName("database")
        data class Database(
            val database: DatabaseDetails,
        ) : MentionDetails() {
            @Serializable
            data class DatabaseDetails(
                val id: String,
            )
        }

        @Serializable
        @SerialName("date")
        data class Date(
            val date: DateDetails,
        ) : MentionDetails() {
            @Serializable
            data class DateDetails(
                val start: Instant,
                val end: Instant? = null,
            )
        }

        @OptIn(ExperimentalSerializationApi::class)
        @Serializable
        @SerialName("link_preview")
        data class Link(
            @JsonNames("link_preview")
            val link: LinkDetails,
        ) : MentionDetails() {
            @Serializable
            data class LinkDetails(
                val url: String,
            )
        }

        @Serializable
        @SerialName("page")
        data class Page(
            val page: PageDetails,
        ) : MentionDetails() {
            @Serializable
            data class PageDetails(
                val id: String,
            )
        }

        @OptIn(ExperimentalSerializationApi::class)
        @Serializable
        @SerialName("template_mention")
        data class Template(
            @JsonNames("template_mention")
            val template: TemplateDetails,
        ) : MentionDetails() {
            @Serializable
            sealed class TemplateDetails {

                @Serializable
                @SerialName("template_mention_date")
                data class Date(
                    @JsonNames("template_mention_date")
                    val date: String,
                )

                @Serializable
                @SerialName("template_mention_user")
                data class User(
                    @JsonNames("template_mention_user")
                    val user: String,
                )
            }
        }

        @Serializable
        @SerialName("user")
        data class User(
            val user: UserDetails,
        ) : MentionDetails() {
            @Serializable
            data class UserDetails(
                val id: String,
            )
        }
    }
}