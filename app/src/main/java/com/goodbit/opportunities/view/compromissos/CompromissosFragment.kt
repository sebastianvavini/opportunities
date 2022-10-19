package com.goodbit.opportunities.view.compromissos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.goodbit.opportunities.databinding.FragmentCompromissosBinding

import com.goodbit.opportunities.viewmodel.CompromissosViewModel

class CompromissosFragment : Fragment() {

    private var _binding: FragmentCompromissosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val compromissosViewModel =
            ViewModelProvider(this).get(CompromissosViewModel::class.java)

        _binding = FragmentCompromissosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        compromissosViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}