package com.example.learndagger_kotlin.di.module

import android.content.Context
import com.example.learndagger_kotlin.MyApplication
import com.example.learndagger_kotlin.di.qualifier.ApplicationContext
import com.example.learndagger_kotlin.di.qualifier.DatabaseInfo
import com.example.learndagger_kotlin.di.qualifier.NetworkInfo
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    internal fun provideContext(): Context {
        return application
    }

    @Provides
    @DatabaseInfo
    internal fun provideDatabaseName(): String {
        return "dummy_db"
    }

    @Provides
    @DatabaseInfo
    internal fun provideDatabaseVersion(): Int? {
        return 1
    }

    @Provides
    @NetworkInfo
    internal fun provideApiKey(): String {
        return "SOME_API_KEY"
    }
}