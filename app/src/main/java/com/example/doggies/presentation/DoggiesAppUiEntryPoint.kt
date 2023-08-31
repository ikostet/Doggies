package com.example.doggies.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import com.example.doggies.presentation.flow.NavGraphs
import com.example.doggies.presentation.flow.destinations.OnBoardingScreenDestination
import com.example.doggies.presentation.flow.splash.SplashViewModel
import com.ramcosta.composedestinations.DestinationsNavHost

@Composable
fun DoggiesAppUiEntryPoint(mainViewModel: SplashViewModel) {
    val onboardPassed = mainViewModel.onboardPassedLiveData.observeAsState(null).value
    onboardPassed?.let {
        val startRoute = if (it) {
            NavGraphs.root.startRoute
        } else OnBoardingScreenDestination
        DestinationsNavHost(
            navGraph = NavGraphs.root,
            startRoute = startRoute
        )
    }
}