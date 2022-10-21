package com.goodbit.opportunities.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AnuncioDataBase( context: Context) :
    SQLiteOpenHelper(context, NAME, null, VERSION) {

        companion object {
            private const val NAME= "opporDB"
            private const val VERSION=1


        }

    override fun onCreate(db: SQLiteDatabase) {

            db.execSQL("create table anuncio (" +
                    "id integer primary key autoincrement,"+
                    "descricao text,"+ "preco real,"+"tipo integer"+
                    ")")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}