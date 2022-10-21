package com.goodbit.opportunities.model

class AnuncioRepository private constructor(){

    companion object{
        private lateinit var repository: AnuncioRepository

        fun getInstance():AnuncioRepository{
            if(!::repository.isInitialized){
                repository=AnuncioRepository()
            }
            return repository
        }
    }

}