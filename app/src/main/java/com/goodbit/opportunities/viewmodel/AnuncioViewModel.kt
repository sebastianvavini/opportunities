package com.goodbit.opportunities.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.goodbit.opportunities.model.AnuncioModel
import com.goodbit.opportunities.model.repository.AnuncioRepository

class AnuncioViewModel(application: Application) :AndroidViewModel(application) {
    private val repository= AnuncioRepository.getInstance(application)

    fun insert(anuncioModel: AnuncioModel){
        repository.insert(anuncioModel)
    }
}