package com.goodbit.opportunities.model

import android.content.Context

class AnuncioRepository private constructor(context: Context){

    private val database= AnuncioDataBase(context)
    companion object{
        private lateinit var repository: AnuncioRepository

        fun getInstance(context: Context):AnuncioRepository{
            if(!::repository.isInitialized){
                repository=AnuncioRepository(context)
            }
            return repository
        }
    }

}