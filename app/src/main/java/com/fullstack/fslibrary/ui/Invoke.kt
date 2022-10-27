package com.fullstack.fslibrary.ui

import android.content.Context
import android.content.Intent
import com.fullstack.fslibrary.MainActivity

class Invoke {
    fun invokeNft(context: Context){
        context.startActivity(Intent( context, MainActivity::class.java))
    }
}