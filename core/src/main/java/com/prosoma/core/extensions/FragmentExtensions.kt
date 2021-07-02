package com.prosoma.core.extensions

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.setupBottomNavigationView(containerId: Int, view: BottomNavigationView) {
    childFragmentManager.findFragmentById(containerId)
        ?.findNavController()
        ?.let { view.setupWithNavController(it) }
}

fun Fragment.registerForConfirmationCallback(
    entryId: Int,
    requestName: String,
    onPositive: () -> Unit,
    onNegative: () -> Unit = {}
) {
    val navBackStackEntry = findNavController().getBackStackEntry(entryId)

    val resumeObserver = LifecycleEventObserver { _, event ->
        if (event == Lifecycle.Event.ON_RESUME
            && navBackStackEntry.savedStateHandle.contains(requestName)
        ) {
            val result = navBackStackEntry.savedStateHandle.get<Boolean>(requestName)
            if (result == true) {
                onPositive()
            } else {
                onNegative()
            }
            navBackStackEntry.savedStateHandle.remove<Boolean>(requestName)
        }
    }

    val destroyObserver = object : LifecycleEventObserver {
        override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                navBackStackEntry.lifecycle.removeObserver(resumeObserver)
                navBackStackEntry.lifecycle.removeObserver(this)
            }
        }
    }

    navBackStackEntry.lifecycle.addObserver(resumeObserver)
    navBackStackEntry.lifecycle.addObserver(destroyObserver)
}
