package com.goodbit.login.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.goodbit.login.data.repository.CadastroRepository

import com.goodbit.opportunities.model.UserModel

class CadastroViewModel(application: Application) : AndroidViewModel(application) {

    private var repository= CadastroRepository.getInstance(application)

    private var salvou_ = MutableLiveData<Boolean>()
    var salvou: LiveData<Boolean> = salvou_

    fun insert(userModel: UserModel){
        salvou_.value = repository.insert(userModel)
    }

    private var listaUsers_=MutableLiveData<List<UserModel>>()
    var lista:LiveData<List<UserModel>> = listaUsers_

    fun getAllUsers(){
        listaUsers_.value= repository.getAll()
    }

    private var logou_ = MutableLiveData<Boolean>()
    var logou: LiveData<Boolean> = logou_

    private var user_logado = MutableLiveData<UserModel?>()
    var logado:LiveData<UserModel?> = user_logado

    fun getUser(userModel: UserModel){
        var user= repository.getUser(userModel)
        logou_.value = user!=null

        if(logou_.value==true){
            user_logado.value = user
        }

    }

}