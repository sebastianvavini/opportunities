package com.goodbit.opportunities.model.repository

import android.content.ContentValues
import android.content.Context
import com.goodbit.opportunities.constants.Constants
import com.goodbit.opportunities.model.AnuncioModel

class AnuncioRepository private constructor(context: Context){

    private val database= OpporDataBase(context)
    companion object{
        private lateinit var repository: AnuncioRepository

        fun getInstance(context: Context): AnuncioRepository {
            if(!Companion::repository.isInitialized){
                repository = AnuncioRepository(context)
            }
            return repository
        }
    }

    fun insert(anuncioModel: AnuncioModel):Boolean{

      try {
          val db = database.writableDatabase

          val tabela=Constants.TABELA.TABLE_NAME_ANUNCIO
          val descricao=Constants.COLUMNS_ANUNCIO.DESCRICAO
          val preco=Constants.COLUMNS_ANUNCIO.PRECO
          val tipo=Constants.COLUMNS_ANUNCIO.TIPO

          val values=ContentValues()

                  values.put(descricao,anuncioModel.descricao)
                  values.put(tipo,anuncioModel.tipo)
                  values.put(preco,anuncioModel.preco)


          db.insert(tabela,null,values)

          return true
      }
      catch (e:Exception){
          return false
      }
    }

}