package com.example.learndagger_kotlin.utils

import android.content.Context
import android.net.ConnectivityManager
import com.example.learndagger_kotlin.di.qualifier.ApplicationContext
import javax.inject.Inject

class NetworkHelper @Inject
constructor(@param:ApplicationContext private val context: Context) {

    val isNetworkConnected: Boolean
        get() {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = connectivityManager.getNetworkInfo(CONNECTIVITY)
            return networkInfo.isConnected
        }

    companion object {

        private val CONNECTIVITY = 1010101
    }
}