package com.goodbit.opportunities.view.opportunities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.goodbit.opportunities.databinding.FragmentOpportunitiesBinding
import com.goodbit.opportunities.viewmodel.OpportunitiesViewModel

class OpportunitiesFragment : Fragment() {

    private var _binding: FragmentOpportunitiesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val opportunitiesViewModel =
            ViewModelProvider(this).get(OpportunitiesViewModel::class.java)

        _binding = FragmentOpportunitiesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        opportunitiesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}