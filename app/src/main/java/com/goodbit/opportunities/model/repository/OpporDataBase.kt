package com.goodbit.opportunities.model.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.goodbit.opportunities.constants.Constants

class OpporDataBase(context: Context) :
    SQLiteOpenHelper(context, NAME, null, VERSION) {

        companion object {
            private const val NAME= "opporDB"
            private const val VERSION=1


        }

    override fun onCreate(db: SQLiteDatabase) {

        val tabela= Constants.TABELA.TABLE_NAME_ANUNCIO
        val id= Constants.COLUMNS_ANUNCIO.ID
        val descricao=Constants.COLUMNS_ANUNCIO.DESCRICAO
        val tipo= Constants.COLUMNS_ANUNCIO.TIPO
        val preco=Constants.COLUMNS_ANUNCIO.PRECO

            db.execSQL("create table $tabela ("+
                    "$id integer primary key autoincrement,"+
                    "$descricao text,"+ "$preco real,"+"$tipo integer"+
                    ")")



        val tabela_user= Constants.TABELA.TABLE_NAME_USER
        val id_user= Constants.COLUMNS_USER.ID

        val username=Constants.COLUMNS_USER.USER
        val cpf= Constants.COLUMNS_USER.CPF
        val whats=Constants.COLUMNS_USER.WHATSAPP
        val password=Constants.COLUMNS_USER.PASSWORD


        db.execSQL("create table $tabela_user ("+
                "$id_user integer primary key autoincrement,"+
                "$username text,"+ "$cpf text,"+ "$password text,"+"$whats text"+
                ")")




    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}