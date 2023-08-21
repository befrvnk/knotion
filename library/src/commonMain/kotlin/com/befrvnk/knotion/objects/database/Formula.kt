package com.befrvnk.knotion.objects.database

import kotlinx.serialization.Serializable

@Serializable
data class Formula(
    val expression: String,
)