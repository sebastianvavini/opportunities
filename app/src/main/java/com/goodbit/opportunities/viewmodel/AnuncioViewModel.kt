package com.goodbit.opportunities.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.goodbit.opportunities.model.AnuncioRepository

class AnuncioViewModel(application: Application) :AndroidViewModel(application) {
    private val repository=AnuncioRepository.getInstance(application)
}