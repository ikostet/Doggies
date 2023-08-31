package com.example.doggies.data.repository

import com.example.doggies.data.local.Storage
import javax.inject.Inject

class OnboardRepository @Inject constructor(
    private val storage: Storage
) {

    var isOnBoardPassed: Boolean
        get() = storage.isOnBoardPassed
        set(passed) {
            storage.isOnBoardPassed = passed
        }
}