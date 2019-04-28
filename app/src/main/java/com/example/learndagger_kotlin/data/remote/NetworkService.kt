package com.example.learndagger_kotlin.data.remote

import android.content.Context
import com.example.learndagger_kotlin.di.qualifier.ApplicationContext
import com.example.learndagger_kotlin.di.qualifier.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */
@Singleton
class NetworkService @Inject
constructor(
    @ApplicationContext context: Context,
    @NetworkInfo apiKey: String
)// do the initialisation here
{

    val dummyData: String
        get() = "NETWORK_DUMMY_DATA"
}