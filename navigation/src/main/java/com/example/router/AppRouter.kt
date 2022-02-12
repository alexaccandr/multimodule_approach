package com.example.router

import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest

object AppRouter {

    fun navigateToFragment1(controller: NavController) {
        val request = NavDeepLinkRequest.Builder
            .fromUri("myapp://www.example.com/fragment1/10".toUri())
            .build()
        controller.navigate(request)
    }

    fun navigateToFragment2(controller: NavController, id: Int, routeId: Int, regionId: Int) {
        val request = NavDeepLinkRequest.Builder
            .fromUri("myapp://www.example.com/fragment2/${id}?route_id=${routeId}&region_id=${regionId}".toUri())
            .build()
        controller.navigate(request)
    }
}