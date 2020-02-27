package com.dasbikash.android_toast_utils

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
//import com.dasbikash.android_extensions.runIfNotDestroyed
//import com.dasbikash.android_extensions.runOnMainThread
//import com.dasbikash.android_extensions.runWithContext

class ToastUtils {
    companion object {
        /**
         * Method to display short toast message
         *
         * @param context | Android Context
         * @param message | message for toast
         * */
        @JvmStatic
        fun showShortToast(context: Context, message: String) {
            runOnMainThread({
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            })
        }

        /**
         * Method to display short toast message
         *
         * @param context | Android Context
         * @param messageId | string resource Id for toast
         * */
        @JvmStatic
        fun showShortToast(context: Context, @StringRes messageId: Int) =
            showShortToast(context, context.getString(messageId))

        /**
         * Method to display long toast message
         *
         * @param context | Android Context
         * @param message | message for toast
         * */
        @JvmStatic
        fun showLongToast(context: Context, message: String) {
            runOnMainThread({
                Toast.makeText(context, message, Toast.LENGTH_LONG).show()
            })
        }

        /**
         * Method to display long toast message
         *
         * @param context | Android Context
         * @param messageId | string resource Id for toast
         * */
        @JvmStatic
        fun showLongToast(context: Context, @StringRes messageId: Int) =
            showLongToast(context, context.getString(messageId))
    }
}

/**
 * Extension function on show Long Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param message Toast message
 * */
fun Activity.showLongToast(message: String){
    runIfNotDestroyed {
        ToastUtils.showLongToast(this, message)
    }
}

/**
 * Extension function on show Long Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param messageId string id resource for Toast message
 * */
fun Activity.showLongToast(@StringRes messageId: Int)
        = showLongToast(getString(messageId))

/**
 * Extension function on show short Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param message Toast message
 * */
fun Activity.showShortToast(message: String){
    runIfNotDestroyed {
        ToastUtils.showShortToast(this, message)
    }
}

/**
 * Extension function on show short Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param messageId string id resource for Toast message
 * */
fun Activity.showShortToast(@StringRes messageId: Int)
        = showShortToast(getString(messageId))

/**
 * Extension function on show Long Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param message Toast message
 * */
fun AppCompatActivity.showLongToast(message: String){
    runIfNotDestroyed {
        ToastUtils.showLongToast(this, message)
    }
}

/**
 * Extension function on show Long Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param messageId string id resource for Toast message
 * */
fun AppCompatActivity.showLongToast(@StringRes messageId: Int)
        = showLongToast(getString(messageId))

/**
 * Extension function on show short Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param message Toast message
 * */
fun AppCompatActivity.showShortToast(message: String){
    runIfNotDestroyed {
        ToastUtils.showShortToast(this, message)
    }
}

/**
 * Extension function on show short Toast from Activity
 * Will run only if activity is not destroyed
 *
 * @param messageId string id resource for Toast message
 * */
fun AppCompatActivity.showShortToast(@StringRes messageId: Int)
        = showShortToast(getString(messageId))

/**
 * Extension function on show Long Toast from fragment
 *
 * @param message Toast message
 * */
fun Fragment.showLongToast(message: String){
    context?.let {
        ToastUtils.showLongToast(it, message)
    }
}

/**
 * Extension function on show Long Toast from fragment
 *
 * @param messageId string id resource for Toast message
 * */
fun Fragment.showLongToast(@StringRes messageId: Int)
        = showLongToast(getString(messageId))

/**
 * Extension function on show short Toast from fragment
 *
 * @param message Toast message
 * */
fun Fragment.showShortToast(message: String){
    context?.let {
        ToastUtils.showShortToast(it,message)
    }
}

/**
 * Extension function on show short Toast from fragment
 *
 * @param messageId string id resource for Toast message
 * */
fun Fragment.showShortToast(@StringRes messageId: Int)
        = showShortToast(getString(messageId))
