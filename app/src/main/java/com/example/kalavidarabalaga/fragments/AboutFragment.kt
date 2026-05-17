package com.example.kalavidarabalaga.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kalavidarabalaga.data.DataProvider
import com.example.kalavidarabalaga.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val artFormsText = DataProvider.artForms.joinToString(separator = "\n") { "• $it" }
        binding.tvArtFormsList.text = artFormsText
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
