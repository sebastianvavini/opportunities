package com.goodbit.opportunities.view.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.goodbit.login.viewmodel.CadastroViewModel
import com.goodbit.opportunities.R
import com.goodbit.opportunities.model.UserModel

import com.goodbit.opportunities.databinding.ActivityLoginBinding
import com.goodbit.opportunities.view.opportunities.MainActivity

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel:CadastroViewModel
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                binding=ActivityLoginBinding.inflate(layoutInflater)
                setContentView(binding.root)

                viewModel= ViewModelProvider(this).get(CadastroViewModel::class.java)

                binding.buttonEntrar.setOnClickListener(this)

                viewModel.logou.observe(this){
                    println("Logou, carai = $it")
                    if (findViewById<TextView>(R.id.text_user_logado)!=null){
                        findViewById<TextView>(R.id.text_user_logado).setText("Texto qualquer")
                    }

                    startActivity(Intent(this,MainActivity::class.java))


                }
                viewModel.logado.observe(this){
                    println("Essa treta ta funcionando-1")
                    if (it!=null){

                        findViewById<TextView?>(R.id.text_user_logado).setText("Chavinho")
                        println("Essa treta ta funcionando")
                    }

                }

    }

    override fun onClick(v: View) {
        if(v.id== R.id.button_entrar){

            val username=binding.editLogin.text.toString()
            val passwd= binding.editPassword.text.toString()

            val user= UserModel(0,username,"--------",passwd,"-------")
            viewModel.getUser(user)
        }
    }
}