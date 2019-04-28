package com.example.learndagger_kotlin.di.component

import android.support.v4.app.Fragment
import com.example.learndagger_kotlin.di.module.FragmentModule
import com.example.learndagger_kotlin.di.scope.FragmentScope
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(fragment: Fragment)
}