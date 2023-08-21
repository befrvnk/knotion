package com.befrvnk.knotion.objects.richtext

import kotlinx.serialization.Serializable

@Serializable
sealed class RichText {
    abstract val annotations: Annotations
    abstract val plainText: String
    abstract val href: String?
}
