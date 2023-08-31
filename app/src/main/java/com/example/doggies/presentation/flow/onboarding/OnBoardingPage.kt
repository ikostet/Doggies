package com.example.doggies.presentation.flow.onboarding

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.doggies.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    @StringRes
    val title: Int,
    @StringRes
    val description: Int,
) {
    object First : OnBoardingPage(
        image = R.drawable.ic_dog1,
        title = R.string.onboarding_first_page_title,
        description = R.string.onboarding_first_page_description
    )

    object Second : OnBoardingPage(
        image = R.drawable.ic_dog2,
        title = R.string.onboarding_second_page_title,
        description = R.string.onboarding_second_page_description
    )

    object Third : OnBoardingPage(
        image = R.drawable.ic_dog3,
        title = R.string.onboarding_third_page_title,
        description = R.string.onboarding_third_page_description
    )
}
