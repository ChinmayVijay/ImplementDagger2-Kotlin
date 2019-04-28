package com.example.learndagger_kotlin.ui


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learndagger_kotlin.MyApplication
import com.example.learndagger_kotlin.R
import com.example.learndagger_kotlin.di.component.DaggerFragmentComponent
import com.example.learndagger_kotlin.di.module.FragmentModule
import javax.inject.Inject

class HomeFragment : Fragment() {

    @Inject
    lateinit var mViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        getDependencies()
        super.onAttach(context)

    }

    fun getDependencies() {
        DaggerFragmentComponent
            .builder()
            .applicationComponent((activity!!.application as MyApplication).applicationComponent)
            .fragmentModule(FragmentModule(this))
            .build()
            .inject(this)

    }

    companion object {

        private var myActivity: Activity? = null

        fun newInstance(activity: Activity): HomeFragment {
            myActivity = activity
            return HomeFragment()
        }
    }
}
