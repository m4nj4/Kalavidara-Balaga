package com.example.kalavidarabalaga.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kalavidarabalaga.ProfileActivity
import com.example.kalavidarabalaga.adapters.TroupeAdapter
import com.example.kalavidarabalaga.data.DataProvider
import com.example.kalavidarabalaga.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: TroupeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSpinners()
        setupRecyclerView()
        setupListeners()
        loadSavedFilters()
    }

    private fun setupSpinners() {
        val districts = listOf("All Districts") + DataProvider.districts
        val districtAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, districts)
        districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerDistrict.adapter = districtAdapter

        val artForms = listOf("All Art Forms") + DataProvider.artForms
        val artFormAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, artForms)
        artFormAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerArtForm.adapter = artFormAdapter
    }

    private fun setupRecyclerView() {
        adapter = TroupeAdapter(DataProvider.troupes) { troupe ->
            val intent = Intent(requireContext(), ProfileActivity::class.java).apply {
                putExtra("TROUPE_ID", troupe.id)
            }
            startActivity(intent)
        }
        binding.rvResults.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rvResults.adapter = adapter
    }

    private fun setupListeners() {
        val spinnerListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                applyFilters()
                saveFilters()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        binding.spinnerDistrict.onItemSelectedListener = spinnerListener
        binding.spinnerArtForm.onItemSelectedListener = spinnerListener

        binding.btnClear.setOnClickListener {
            binding.spinnerDistrict.setSelection(0)
            binding.spinnerArtForm.setSelection(0)
            applyFilters()
            saveFilters()
        }
    }

    private fun applyFilters() {
        val selectedDistrict = binding.spinnerDistrict.selectedItem as String
        val selectedArtForm = binding.spinnerArtForm.selectedItem as String

        val filteredList = DataProvider.troupes.filter { troupe ->
            val matchesDistrict = selectedDistrict == "All Districts" || troupe.district == selectedDistrict
            val matchesArtForm = selectedArtForm == "All Art Forms" || troupe.artForm == selectedArtForm
            matchesDistrict && matchesArtForm
        }
        adapter.updateData(filteredList)
    }

    private fun saveFilters() {
        val prefs = requireActivity().getSharedPreferences("KalavidaraPrefs", Context.MODE_PRIVATE)
        prefs.edit().apply {
            putInt("DISTRICT_POS", binding.spinnerDistrict.selectedItemPosition)
            putInt("ART_FORM_POS", binding.spinnerArtForm.selectedItemPosition)
            apply()
        }
    }

    private fun loadSavedFilters() {
        val prefs = requireActivity().getSharedPreferences("KalavidaraPrefs", Context.MODE_PRIVATE)
        val districtPos = prefs.getInt("DISTRICT_POS", 0)
        val artFormPos = prefs.getInt("ART_FORM_POS", 0)
        
        binding.spinnerDistrict.setSelection(districtPos)
        binding.spinnerArtForm.setSelection(artFormPos)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
