package com.befrvnk.knotion.objects.other

import com.befrvnk.knotion.objects.Id
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
sealed class RichText {
    abstract val annotations: Annotations
    abstract val plainText: String
    abstract val href: String?
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("equation")
data class Equation(
    val equation: EquationDetails,
    override val annotations: Annotations,
    @JsonNames("plain_text")
    override val plainText: String,
    override val href: String? = null,
) : RichText() {
    @Serializable
    data class EquationDetails(
        val expression: String,
    )
}

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
                val id: Id,
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
                val id: Id,
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
                val id: Id,
            )
        }
    }
}

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@SerialName("text")
data class Text(
    override val annotations: Annotations,
    @JsonNames("plain_text")
    override val plainText: String,
    override val href: String? = null,
    val text: TextDetails,
) : RichText() {
    @Serializable
    data class TextDetails(
        val content: String,
        val link: Link? = null,
    ) {
        @Serializable
        data class Link(
            val url: String,
        )
    }
}

@Serializable
data class Annotations(
    val bold: Boolean,
    val italic: Boolean,
    val strikethrough: Boolean,
    val underline: Boolean,
    val code: Boolean,
    val color: Color,
)

@OptIn(ExperimentalSerializationApi::class)
@Serializable
enum class Color {
    @JsonNames("blue") BLUE,
    @JsonNames("blue_background") BLUE_BACKGROUND,
    @JsonNames("brown") BROWN,
    @JsonNames("brown_background") BROWN_BACKGROUND,
    @JsonNames("default")DEFAULT,
    @JsonNames("gray") GRAY,
    @JsonNames("gray_background") GRAY_BACKGROUND,
    @JsonNames("green") GREEN,
    @JsonNames("green_background") GREEN_BACKGROUND,
    @JsonNames("orange") ORANGE,
    @JsonNames("orange_background") ORANGE_BACKGROUND,
    @JsonNames("pink") PINK,
    @JsonNames("pink_background") PINK_BACKGROUND,
    @JsonNames("purple") PURPLE,
    @JsonNames("purple_background") PURPLE_BACKGROUND,
    @JsonNames("red") RED,
    @JsonNames("red_background") RED_BACKGROUND,
    @JsonNames("yellow") YELLOW,
    @JsonNames("yellow_background") YELLOW_BACKGROUND,
}