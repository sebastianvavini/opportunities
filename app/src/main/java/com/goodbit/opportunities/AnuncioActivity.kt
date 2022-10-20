package com.goodbit.opportunities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.goodbit.opportunities.databinding.ActivityAnuncioBinding

class AnuncioActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAnuncioBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityAnuncioBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.butonSalvarAnuncio.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if(v.id==R.id.butonSalvarAnuncio){

        }
    }
}