package com.prosoma.livingwell.di.main

import com.prosoma.livingwell.presentation.main.MainActivity
import com.prosoma.livingwell.presentation.second.SecondFragment

interface MainInjector {

    fun inject(activity: MainActivity)
    fun inject(fragment: SecondFragment)
    fun clearMainComponent()
}