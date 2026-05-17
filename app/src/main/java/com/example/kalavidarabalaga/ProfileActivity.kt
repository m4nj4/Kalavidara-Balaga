package com.example.kalavidarabalaga

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kalavidarabalaga.adapters.GalleryAdapter
import com.example.kalavidarabalaga.data.DataProvider
import com.example.kalavidarabalaga.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private var phoneNumber: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val troupeId = intent.getStringExtra("TROUPE_ID")
        val troupe = DataProvider.troupes.find { it.id == troupeId }

        if (troupe != null) {
            phoneNumber = troupe.phone
            
            binding.collapsingToolbar.title = troupe.name
            binding.tvTroupeName.text = troupe.name
            binding.tvArtDistrict.text = "${troupe.artForm} • ${troupe.district}"
            binding.tvLeadContact.text = "Lead: ${troupe.leadContact} (${troupe.memberCount} members, ${troupe.yearsActive} yrs active)"
            binding.tvServiceArea.text = "Service Area: ${troupe.serviceArea}"
            binding.tvEquipment.text = troupe.equipmentList
            binding.ivCover.setImageResource(troupe.imageResId)
        }

        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { onBackPressedDispatcher.onBackPressed() }

        binding.rvGallery.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.rvGallery.adapter = GalleryAdapter(6) // 6 placeholder images

        binding.fabCall.setOnClickListener {
            phoneNumber?.let { num ->
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$num")
                startActivity(intent)
            }
        }
    }
}
