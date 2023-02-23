package com.example.activitylifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyObserver(private val lifecycleTag: String) : DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) {
        Log.d(lifecycleTag, "onStart called")
    }
    override fun onResume(owner: LifecycleOwner) {
        Log.d(lifecycleTag, "onResume called")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d(lifecycleTag, "onPause called")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(lifecycleTag, "onDestroy called")
    }

    override fun onCreate(owner: LifecycleOwner) {
        Log.d(lifecycleTag, "onCreate called")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d(lifecycleTag, "onStop called")
    }
}
