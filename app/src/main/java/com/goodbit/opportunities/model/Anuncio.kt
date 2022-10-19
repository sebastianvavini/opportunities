package com.goodbit.opportunities.model

class Anuncio {

    private var descricao:String // descrição do que esta sendo ofertado ou demandado
    private var tipo:String // compra (demanda) ou venda (oferta)
    private var preco:Double // preço a ser cobrado ou valor que o demandante esta disposto a pagar
    private var qtd:Int // quantidade de unidades
    private var medida:String //unidade de medida

    constructor(descricao: String, tipo:String, preco:Double,qtd:Int,medida:String){
        this.descricao=descricao
        this.tipo=tipo
        this.preco=preco
        this.qtd=qtd
        this.medida=medida
    }
    fun getMedida():String{
        return this.medida
    }
    fun setMedida(medida: String){
         this.medida=medida
    }
    fun getQtd():Int{
        return this.qtd
    }
    fun setQtd(qtd: Int){
        this.qtd=qtd
    }

   fun getDescricao():String{
       return this.descricao
   }
    fun setDescricao(descricao: String){
        this.descricao=descricao
    }
    fun getTipo():String{
        return this.tipo
    }
    fun setTipo(tipo: String){
        this.tipo=tipo
    }
    fun getPreco():Double{
        return this.preco
    }
    fun setPreco(preco: Double){
        this.preco=preco
    }

}


