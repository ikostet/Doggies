package com.example.doggies.presentation.flow.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.doggies.data.repository.OnboardRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    onBoardRepository: OnboardRepository
) : ViewModel() {

    private val _onboardPassedLiveData = MutableLiveData<Boolean>()
    val onboardPassedLiveData: LiveData<Boolean?> = _onboardPassedLiveData

    init {
        _onboardPassedLiveData.value = onBoardRepository.isOnBoardPassed
    }
}