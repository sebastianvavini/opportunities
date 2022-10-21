package com.goodbit.opportunities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.goodbit.opportunities.databinding.ActivityAnuncioBinding
import com.goodbit.opportunities.viewmodel.AnuncioViewModel

class AnuncioActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAnuncioBinding
    private lateinit var viewModel:AnuncioViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityAnuncioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel= ViewModelProvider(this).get(AnuncioViewModel::class.java)
       binding.butonSalvarAnuncio.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if(v.id==R.id.butonSalvarAnuncio){

        }
    }
}