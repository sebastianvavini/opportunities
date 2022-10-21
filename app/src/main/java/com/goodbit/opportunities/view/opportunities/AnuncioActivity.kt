package com.goodbit.opportunities.view.opportunities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
<<<<<<< HEAD:app/src/main/java/com/goodbit/opportunities/AnuncioActivity.kt
=======
import com.goodbit.opportunities.R
>>>>>>> 3da1be7cf3008f4f6858e5635cd570733a0ce6cf:app/src/main/java/com/goodbit/opportunities/view/opportunities/AnuncioActivity.kt
import com.goodbit.opportunities.databinding.ActivityAnuncioBinding
import com.goodbit.opportunities.viewmodel.AnuncioViewModel

class AnuncioActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityAnuncioBinding
<<<<<<< HEAD:app/src/main/java/com/goodbit/opportunities/AnuncioActivity.kt
    private lateinit var viewModel:AnuncioViewModel
=======
    private lateinit var viewModel: AnuncioViewModel
>>>>>>> 3da1be7cf3008f4f6858e5635cd570733a0ce6cf:app/src/main/java/com/goodbit/opportunities/view/opportunities/AnuncioActivity.kt


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityAnuncioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel= ViewModelProvider(this).get(AnuncioViewModel::class.java)
<<<<<<< HEAD:app/src/main/java/com/goodbit/opportunities/AnuncioActivity.kt
       binding.butonSalvarAnuncio.setOnClickListener(this)
=======

        binding.butonSalvarAnuncio.setOnClickListener(this)
        binding.radioDemanda.isChecked=true
>>>>>>> 3da1be7cf3008f4f6858e5635cd570733a0ce6cf:app/src/main/java/com/goodbit/opportunities/view/opportunities/AnuncioActivity.kt

    }

    override fun onClick(v: View) {
        if(v.id== R.id.butonSalvarAnuncio){

        }
    }
}