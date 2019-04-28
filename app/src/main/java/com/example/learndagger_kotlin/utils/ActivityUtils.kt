@file:JvmName("ActivityUtils")
package com.example.learndagger_kotlin.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

class ActivityUtils {
    companion object {
        fun addFragmentToActivity(manager: FragmentManager, fragment: Fragment, frameId: Int) {

            val transaction = manager.beginTransaction()
            transaction.add(frameId, fragment)
            transaction.commit()

        }
    }
}
