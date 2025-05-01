package com.avCoding.core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class AVBaseActivity<VB: ViewBinding> : AppCompatActivity() {
    /**
     * @getBinding() abstract method will be responsible for
     * generating the binding for UI classes
     **/
    abstract fun getBinding(): VB

    /**
     * @views variable will return the
     * real instance for accessing the UI components
     **/
    protected lateinit var views: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.views = getBinding()
        setContentView(views.root)
    }
}