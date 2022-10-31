package com.goodbit.opportunities.constants

class Constants private constructor(){

     object TABELA{

        const val TABLE_NAME_ANUNCIO="anuncio"
         const val TABLE_NAME_USER="user"
    }
    object COLUMNS_ANUNCIO{
        const val ID="id"
        const val DESCRICAO="descricao"
        const val PRECO= "preco"
        const val TIPO= "tipo"
    }

    object COLUMNS_USER{
        //(user:String, password:String,whatsapp:String)
        const val ID="id"
        const val CPF="cpf"
        const val USER="user"
        const val PASSWORD="password"
        const val WHATSAPP="whats"

    }

}