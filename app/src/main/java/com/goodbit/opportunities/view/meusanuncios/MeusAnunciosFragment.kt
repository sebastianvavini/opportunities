package com.goodbit.opportunities.view.meusanuncios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.goodbit.opportunities.databinding.FragmentMeusanunciosBinding

import com.goodbit.opportunities.viewmodel.MeusAnunciosViewModel

class MeusAnunciosFragment : Fragment() {

    private var _binding: FragmentMeusanunciosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val meusAnunciosViewModel =
            ViewModelProvider(this).get(MeusAnunciosViewModel::class.java)

        _binding = FragmentMeusanunciosBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // val textView: TextView = binding.textSlideshow
        meusAnunciosViewModel.text.observe(viewLifecycleOwner) {
           // textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}