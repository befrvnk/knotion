package com.befrvnk.knotion.objects.other

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Owner

@Serializable
@SerialName("workspace")
object WorkspaceOwner : Owner()

@Serializable
@SerialName("user")
object UserOwner : Owner()
