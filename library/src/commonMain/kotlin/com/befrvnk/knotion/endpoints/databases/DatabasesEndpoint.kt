package com.befrvnk.knotion.endpoints.databases

interface DatabasesEndpoint {

    suspend fun createDatabase()

    suspend fun filterDatabaseEntries()

    suspend fun sortDatabaseEntries()

    suspend fun queryDatabase()

    suspend fun retrieveDatabase()

    suspend fun updateDatabase()
}