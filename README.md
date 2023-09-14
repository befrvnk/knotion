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

### Snapshot

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

## API

### Block Endpoint
```kotlin
knotion.authenticationEndpoint.createToken()
knotion.blocksEndpoint.appendBlockChildren()
knotion.blocksEndpoint.retrieveBlock()
knotion.blocksEndpoint.retrieveBlockChildren()
knotion.blocksEndpoint.updateBlock()
knotion.blocksEndpoint.deleteBlock()
```

### Comments Endpoint

```kotlin
knotion.commentsEndpoint.createComment()
knotion.commentsEndpoint.retrieveComments()
```

### Databases Endpoint

```kotlin
knotion.databasesEndpoint.createDatabase()
knotion.databasesEndpoint.queryDatabasse()
knotion.databasesEndpoint.retrieveDatabase()
knotion.databasesEndpoint.updateDatabase()
```

### Pages Endpoint

```kotlin
knotion.pagesEndpoint.createPage()
knotion.pagesEndpoint.retrievePage()
knotion.pagesEndpoint.retrievePagePropertyItem()
knotion.pagesEndpoint.updatePageProperties()
```

### Search Endpoint

```kotlin
knotion.searchEndpoint.searchByTitle()
```

### Users Endpoint

```kotlin
knotion.usersEndpoint.listAllUsers()
knotion.usersEndpoint.retrieveUser()
knotion.usersEndpoint.retrieveMyUser()
```