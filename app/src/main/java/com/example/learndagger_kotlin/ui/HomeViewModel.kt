package com.example.learndagger_kotlin.ui

import com.example.learndagger_kotlin.data.local.DatabaseService
import com.example.learndagger_kotlin.data.remote.NetworkService
import com.example.learndagger_kotlin.di.scope.FragmentScope
import com.example.learndagger_kotlin.utils.NetworkHelper
import javax.inject.Inject

@FragmentScope
class HomeViewModel @Inject
constructor(
    // TODO: Implement the ViewModel

    private val databaseService: DatabaseService,
    private val networkService: NetworkService,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    val someData: String
        get() =
            databaseService.getDummyData() + " : " + networkService.getDummyData() + " : Network Connection is " + networkHelper.isNetworkConnected()
}