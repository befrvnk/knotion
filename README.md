# KNotion

A Notion client for Kotlin.

This library was created to be used with another project. Therefore, not everything is tested yet.

## Usage

```kotlin
val integrationToken = "123456"
val knotion = Knotion(integrationToken)

val pageId = "123456"
knotion.pagesEndpoint.retrievePage(pageId)
```

## Snapshot

**settings.gradle.kts**
```kotlin
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
    }
}
```

**build.gradle.kts**
```kotlin
implementation("com.befrvnk:knotion-jvm:0.1.0-SNAPSHOT")
```