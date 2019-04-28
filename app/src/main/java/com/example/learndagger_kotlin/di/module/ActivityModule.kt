package com.example.learndagger_kotlin.di.module

import android.app.Activity
import android.content.Context
import com.example.learndagger_kotlin.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity?) {

    @ActivityContext
    @Provides
    internal fun provideContext(): Context? {
        return activity
    }
}