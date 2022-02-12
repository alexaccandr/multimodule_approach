package com.example.feature3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class TestFragment3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment3_layout, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = requireArguments()
        val routeId = args.getString("route_id")
        val id = args.getString("id")
        val regionId = args.getString("region_id")

        view.findViewById<TextView>(R.id.textView).text = "id=${id}\nrouteId=${routeId}\nregionId=${regionId}"
    }
}