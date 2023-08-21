package com.befrvnk.knotion.objects.richtext

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

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