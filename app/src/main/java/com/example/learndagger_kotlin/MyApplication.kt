package com.example.learndagger_kotlin

import android.app.Application
import com.example.learndagger_kotlin.data.local.DatabaseService
import com.example.learndagger_kotlin.data.remote.NetworkService
import com.example.learndagger_kotlin.di.component.ApplicationComponent
import com.example.learndagger_kotlin.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    internal var networkService: NetworkService? = null

    @Inject
    internal var databaseService: DatabaseService? = null

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}