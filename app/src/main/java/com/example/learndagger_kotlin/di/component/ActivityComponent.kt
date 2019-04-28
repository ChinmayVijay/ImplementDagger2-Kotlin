package com.example.learndagger_kotlin.di.component

import com.example.learndagger_kotlin.di.module.ActivityModule
import com.example.learndagger_kotlin.di.scope.ActivityScope
import com.example.learndagger_kotlin.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}