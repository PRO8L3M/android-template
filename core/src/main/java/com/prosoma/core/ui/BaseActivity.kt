package com.prosoma.core.ui

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.prosoma.core.R

abstract class BaseActivity<TViewBinding : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: TViewBinding

    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
    }

    fun setActionBar(toolbar: Toolbar) = setSupportActionBar(toolbar)

    fun showTitle(showTitle: Boolean) = supportActionBar?.setDisplayShowTitleEnabled(showTitle)

    fun showHomeAsUp(
        showHomeAsUp: Boolean,
        drawable: Drawable? = ContextCompat.getDrawable(this, R.drawable.ic_baseline_arrow_back_24)
    ) {
        supportActionBar?.setDisplayHomeAsUpEnabled(showHomeAsUp)
        supportActionBar?.setHomeAsUpIndicator(drawable)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> false
        }
    }
}