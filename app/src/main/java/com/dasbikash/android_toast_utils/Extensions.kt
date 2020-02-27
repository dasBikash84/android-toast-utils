package com.dasbikash.android_toast_utils

import android.app.Activity
import android.os.Build
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle

internal fun Any.runOnMainThread(task: () -> Any?,delayMs:Long=0L){
    Handler(Looper.getMainLooper()).postDelayed( {
        if (this is AppCompatActivity){
            runIfNotDestroyed { task() }
        }else if(this is Fragment){
            runIfNotDestroyed { task() }
        }else if(this is Activity){
            runIfNotDestroyed { task() }
        }else {
            task()
        }
    },delayMs)
}

internal fun Activity.runIfNotDestroyed(task:()->Any?){
    if (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            !isDestroyed
        } else {
            true
        }
    ) {
        task()
    }
}

internal fun AppCompatActivity.runIfNotDestroyed(task:()->Any?){
    if (this.lifecycle.currentState != Lifecycle.State.DESTROYED){
        task()
    }
}
internal fun Fragment.runIfNotDestroyed(task:()->Any?){
    if (this.lifecycle.currentState != Lifecycle.State.DESTROYED){
        task()
    }
}