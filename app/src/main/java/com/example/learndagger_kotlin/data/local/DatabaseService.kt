package com.example.learndagger_kotlin.data.local

import android.content.Context
import com.example.learndagger_kotlin.di.qualifier.ApplicationContext
import com.example.learndagger_kotlin.di.qualifier.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy class to simulate the actual Database using Room or Realm etc
 */
@Singleton
class DatabaseService @Inject
constructor(
    @ApplicationContext context: Context,
    @DatabaseInfo databaseName: String,
    @DatabaseInfo version: Int?
)// do the initialisation here
{

    val dummyData: String
        get() = "DATABASE_DUMMY_DATA"
}