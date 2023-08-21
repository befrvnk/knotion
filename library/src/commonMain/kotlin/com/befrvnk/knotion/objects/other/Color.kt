package com.befrvnk.knotion.objects.other

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

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