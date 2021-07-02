package com.prosoma.livingwell.presentation.first

import androidx.fragment.app.Fragment
import com.prosoma.core.navigation.BaseFragmentNavigator
import javax.inject.Inject

class FirstNavigator @Inject constructor(
    fragment: Fragment
) : BaseFragmentNavigator(fragment) {

    fun navigateToSecondFragment() {
        navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment())
    }
}