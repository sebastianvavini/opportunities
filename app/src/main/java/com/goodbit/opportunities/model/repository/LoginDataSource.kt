package com.goodbit.opportunities.model.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.io.IOException
import java.util.*

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {
//(context: Context)
    //private val dataBase= OpporDataBase(context)


    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
                   // get(username,password)

            val fakeUser = LoggedInUser(UUID.randomUUID().toString(), "Sebastiao Vinícius")
            return Result.Success(fakeUser)

        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }




}