package com.example.doggies.presentation.flow.onboarding

import androidx.lifecycle.ViewModel
import com.example.doggies.data.repository.OnboardRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val onboardRepository: OnboardRepository
) : ViewModel() {

    fun finishOnboard() {
        onboardRepository.isOnBoardPassed = true
    }
}