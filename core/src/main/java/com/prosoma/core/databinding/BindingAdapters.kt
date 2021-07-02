package com.prosoma.core.databinding

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter

@BindingAdapter("isVisible")
fun setViewVisible(view: View, isVisible: Boolean?) {
    isVisible?.let {
        view.isVisible = it
    } ?: run {
        view.isVisible = false
    }
}

@BindingAdapter("isHidden")
fun setViewHidden(view: View, isHidden: Boolean?) {
    isHidden?.let {
        view.visibility = if (it) View.INVISIBLE else View.VISIBLE
    }
}