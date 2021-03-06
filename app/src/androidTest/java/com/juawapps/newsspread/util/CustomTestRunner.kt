package com.juawapps.newsspread.util

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner

import com.juawapps.newsspread.TestApp

/**
 * Custom runner to mock dependency injection.
 */

class CustomTestRunner : AndroidJUnitRunner() {

    @Throws(InstantiationException::class, IllegalAccessException::class, ClassNotFoundException::class)
    override fun newApplication(cl: ClassLoader, className: String, context: Context): Application {
        return super.newApplication(cl, TestApp::class.java.name, context)
    }
}