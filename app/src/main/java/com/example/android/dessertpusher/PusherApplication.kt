package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 * Project          : andfun-kotlin-dessert-pusher-starter-code
 * Revision History : version 1
 * Date             : 21/06/21
 * Original author  : saurabh
 * Description      : Initial version
 */
class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}