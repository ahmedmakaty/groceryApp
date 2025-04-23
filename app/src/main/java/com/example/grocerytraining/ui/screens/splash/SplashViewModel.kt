package com.example.grocerytraining.ui.screens.splash

import androidx.lifecycle.ViewModel
import com.example.grocerytraining.data.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(val userRepository: UserRepository) : ViewModel() {
}


