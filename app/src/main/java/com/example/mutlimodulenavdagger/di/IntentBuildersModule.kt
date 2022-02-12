package com.example.mutlimodulenavdagger.di

import android.content.Context
import androidx.navigation.NavDeepLinkBuilder
import com.example.mutlimodulenavdagger.MainActivity
import com.example.mutlimodulenavdagger.R
import com.example.router.Feature3IntentBuilder
import com.example.router.RouterHiltConstants
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class IntentBuildersModule {

    fun provideFeature3Builder(context: Context): Feature3IntentBuilder{
        return Feature3IntentBuilder { id: Int, route: Int, ->
            NavDeepLinkBuilder(context)
                .setGraph(R.navigation.nav_graph)
                .setDestination(com.example.feature3.R.id.testFragment3)
                .setComponentName(MainActivity::class.java)
                .createPendingIntent()
        }
    }
}