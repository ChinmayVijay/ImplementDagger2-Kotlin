package com.example.learndagger_kotlin.di.qualifier

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import javax.inject.Qualifier

@Qualifier
@Retention(RetentionPolicy.SOURCE)
annotation class ActivityContext