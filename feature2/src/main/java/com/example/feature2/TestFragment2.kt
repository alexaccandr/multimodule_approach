package com.example.feature2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.router.Feature3IntentBuilder
import javax.inject.Inject

class TestFragment2 : Fragment() {

    @Inject
    lateinit var feature3IntentBuilder: Feature3IntentBuilder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2_layout, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = requireArguments()
        val routeId = args.getString("route_id")
        val id = args.getString("id")
        val regionId = args.getString("region_id")

        view.findViewById<TextView>(R.id.textView).text = "id=${id}\nrouteId=${routeId}\nregionId=${regionId}"

        view.findViewById<Button>(R.id.goToFragment_3_Button).setOnClickListener {
            val pendingIntent = feature3IntentBuilder.createIntent(id = 100, routeId = 400)
            // create notification
        }
    }
}