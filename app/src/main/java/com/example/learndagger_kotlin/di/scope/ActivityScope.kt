package com.example.learndagger_kotlin.di.scope

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import javax.inject.Scope

@Scope
@Retention(RetentionPolicy.SOURCE)
annotation class ActivityScope