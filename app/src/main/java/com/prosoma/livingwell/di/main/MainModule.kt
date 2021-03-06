package com.prosoma.livingwell.di.main

import androidx.lifecycle.ViewModel
import com.prosoma.core.viewmodels.ViewModelKey
import com.prosoma.domain.models.MainNavigator
import com.prosoma.livingwell.presentation.main.MainActivityNavigator
import com.prosoma.livingwell.presentation.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainModule {

    @Binds
    fun bindNavigator(navigator: MainActivityNavigator): MainNavigator

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindViewModel(viewModel: MainViewModel): ViewModel
}