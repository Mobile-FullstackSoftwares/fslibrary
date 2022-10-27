package com.fullstack.fslibrary.ui

import android.content.Context
import android.content.Intent

object Invoke {
    fun invokeNft(context: Context){
        context.startActivity(Intent( context, EmptyActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
    }
}