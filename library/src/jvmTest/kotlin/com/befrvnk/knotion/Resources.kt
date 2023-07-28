package com.befrvnk.knotion

import okio.FileSystem
import okio.Path.Companion.toPath

actual object Resources {
    actual fun readString(path: String): String = FileSystem.SYSTEM.read(path.toPath()) { readUtf8() }
}