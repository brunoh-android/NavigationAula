package br.bruno.navigationaula

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var filme1 = view.findViewById<View>(R.id.card1)
        filme1.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment1)
        }

        var filme2 = view.findViewById<View>(R.id.card2)
        filme2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment2)
        }

        var filme3 = view.findViewById<View>(R.id.card3)
        filme3.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment3)
        }

        var filme4 = view.findViewById<View>(R.id.card4)
        filme4.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment4)
        }

        var filme5 = view.findViewById<View>(R.id.card5)
        filme5.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment5)
        }

        var filme6 = view.findViewById<View>(R.id.card6)
        filme6.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment6)
        }

        var filme7 = view.findViewById<View>(R.id.card7)
        filme7.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment7)
        }

        var filme8 = view.findViewById<View>(R.id.card8)
        filme8.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_fragment8)
        }

    }
}