package com.example.kalavidarabalaga.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kalavidarabalaga.ProfileActivity
import com.example.kalavidarabalaga.adapters.TroupeAdapter
import com.example.kalavidarabalaga.data.DataProvider
import com.example.kalavidarabalaga.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val adapter = TroupeAdapter(DataProvider.troupes) { troupe ->
            val intent = Intent(requireContext(), ProfileActivity::class.java).apply {
                putExtra("TROUPE_ID", troupe.id)
            }
            startActivity(intent)
        }
        binding.rvTroupes.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rvTroupes.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
