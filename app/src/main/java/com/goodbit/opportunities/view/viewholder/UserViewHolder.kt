package com.goodbit.login.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.goodbit.opportunities.databinding.RowUserBinding
import com.goodbit.opportunities.model.UserModel



class UserViewHolder(private val bind: RowUserBinding) :RecyclerView.ViewHolder(bind.root) {

    fun bind(user: UserModel){
        bind.textUsername.text=user.user
    }
}