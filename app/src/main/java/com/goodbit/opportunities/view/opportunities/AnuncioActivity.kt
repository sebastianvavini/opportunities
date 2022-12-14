package com.goodbit.opportunities.view.opportunities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.goodbit.opportunities.R

import com.goodbit.opportunities.databinding.ActivityAnuncioBinding
import com.goodbit.opportunities.model.AnuncioModel
import com.goodbit.opportunities.viewmodel.AnuncioViewModel

class AnuncioActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAnuncioBinding
    private lateinit var viewModel: AnuncioViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityAnuncioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel= ViewModelProvider(this).get(AnuncioViewModel::class.java)

       binding.butonSalvarAnuncio.setOnClickListener(this)

        binding.butonSalvarAnuncio.setOnClickListener(this)
        binding.radioDemanda.isChecked=true
    }

    override fun onClick(v: View) {
        if(v.id== R.id.butonSalvarAnuncio){
                println("botao funciona")
            val descricao=binding.editDescricao.text.toString()
            val preco= binding.editPreco.text.toString().toDouble()

            var tipo:Int

                    if(binding.radioDemanda.isChecked){
                         tipo=1 // é demanda
                    }
                    else{
                        tipo = 0 // é oferta
                    }


         viewModel.insert(AnuncioModel(1,descricao,preco,tipo))
        }
    }
}