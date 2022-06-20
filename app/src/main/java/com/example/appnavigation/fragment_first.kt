package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import java.time.temporal.TemporalAdjusters.next

class fragment_first : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val Botao1: Button = view.findViewById(R.id.button)
        val Botao2: Button = view.findViewById(R.id.button22)

        Botao1.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_fragment_first_to_fragment_second)
        }
        Botao2.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_fragment_first_to_fragment_third2)
        }
        return view

    }
}
