package com.example.router

import android.app.PendingIntent

class Feature3IntentBuilder(private val pendingIntentBlock: (Int, Int) -> PendingIntent) {

    fun createIntent(id: Int, routeId: Int): PendingIntent {
        return pendingIntentBlock(id, routeId)
    }
}