package com.example.samplearchitectureapp.presentation.main

sealed interface MainUiState {


    object Initial : MainUiState

    object Loading : MainUiState

    data class Success(val outputText: String) : MainUiState

    data class Error(val errorMessage: String) : MainUiState

}