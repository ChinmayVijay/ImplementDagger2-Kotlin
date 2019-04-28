package com.example.learndagger_kotlin.ui

import com.example.learndagger_kotlin.data.local.DatabaseService
import com.example.learndagger_kotlin.data.remote.NetworkService
import com.example.learndagger_kotlin.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject
constructor(private val databaseService: DatabaseService, private val networkService: NetworkService) {

    val someData: String
        get() = databaseService.dummyData + " : " + networkService.dummyData
}