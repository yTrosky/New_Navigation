package com.example.appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class fragment_fifth2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fifth2, container, false)

        view.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_fragment_fifth2_to_fragment_sixth2)
        }
        return view
    }
}