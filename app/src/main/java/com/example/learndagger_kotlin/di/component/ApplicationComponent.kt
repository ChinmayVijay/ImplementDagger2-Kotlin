package com.example.learndagger_kotlin.di.component

import android.content.Context
import com.example.learndagger_kotlin.MyApplication
import com.example.learndagger_kotlin.data.local.DatabaseService
import com.example.learndagger_kotlin.data.remote.NetworkService
import com.example.learndagger_kotlin.di.module.ApplicationModule
import com.example.learndagger_kotlin.di.qualifier.ApplicationContext
import com.example.learndagger_kotlin.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    @get:ApplicationContext
    val context: Context

    val networkService: NetworkService

    val databaseService: DatabaseService

    val networkHelper: NetworkHelper

    fun inject(application: MyApplication)

}