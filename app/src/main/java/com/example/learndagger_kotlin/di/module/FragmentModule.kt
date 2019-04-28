package com.example.learndagger_kotlin.di.module

import android.content.Context
import android.support.v4.app.Fragment
import com.example.learndagger_kotlin.di.qualifier.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule(private val fragment: Fragment) {

    @ActivityContext
    @Provides
    internal fun provideContext(): Context? {
        return fragment.getContext()
    }
}