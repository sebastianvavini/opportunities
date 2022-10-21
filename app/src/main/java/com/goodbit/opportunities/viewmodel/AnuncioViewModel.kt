package com.goodbit.opportunities.viewmodel

import androidx.lifecycle.ViewModel
import com.goodbit.opportunities.model.AnuncioRepository

class AnuncioViewModel:ViewModel() {
    private val repository=AnuncioRepository()
}