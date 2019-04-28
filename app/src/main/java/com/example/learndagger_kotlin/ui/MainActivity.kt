package com.example.learndagger_kotlin.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.learndagger_kotlin.MyApplication
import com.example.learndagger_kotlin.R
import com.example.learndagger_kotlin.di.module.ActivityModule
import com.example.learndagger_kotlin.utils.ActivityUtils
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    internal var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
        setContentView(R.layout.activity_main)

        val homeFragment:HomeFragment = HomeFragment.newInstance(this)

        ActivityUtils.addFragmentToActivity(
            getSupportFragmentManager(), homeFragment, R.id.fragment_container)



        val tvData = findViewById(R.id.tvData)
        tvData.setText(viewModel!!.someData)
    }

    fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((getApplication() as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)

    }
}
