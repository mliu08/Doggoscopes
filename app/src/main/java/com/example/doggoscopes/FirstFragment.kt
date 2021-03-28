package com.example.doggoscopes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.title_screen, container, false)

    }

    override fun getView(): View? {
        return super.getView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.ariesButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        view.findViewById<Button>(R.id.taurusButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_TaurusFragment)
        }
        view.findViewById<Button>(R.id.geminiButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_GeminiFragment)
        }
        view.findViewById<Button>(R.id.cancerButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_CancerFragment)
        }
        view.findViewById<Button>(R.id.leoButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_LeoFragment)
        }
        view.findViewById<Button>(R.id.virgoButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_VirgoFragment)
        }
        view.findViewById<Button>(R.id.libraButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_LibraFragment)
        }
        view.findViewById<Button>(R.id.scorpioButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_ScorpioFragment)
        }
        view.findViewById<Button>(R.id.sagittariusButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SagittariusFragment)
        }
        view.findViewById<Button>(R.id.capricornButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_CapricornFragment)
        }
        view.findViewById<Button>(R.id.aquariusButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_AquariusFragment)
        }
        view.findViewById<Button>(R.id.piscesButton).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_PiscesFragment)
        }
    }
}