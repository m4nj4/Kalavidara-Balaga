package com.example.kalavidarabalaga.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kalavidarabalaga.data.Troupe
import com.example.kalavidarabalaga.databinding.ItemTroupeBinding

class TroupeAdapter(
    private var troupes: List<Troupe>,
    private val onItemClick: (Troupe) -> Unit
) : RecyclerView.Adapter<TroupeAdapter.TroupeViewHolder>() {

    inner class TroupeViewHolder(val binding: ItemTroupeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(troupe: Troupe) {
            binding.tvName.text = troupe.name
            binding.tvArtForm.text = troupe.artForm
            binding.tvDistrict.text = troupe.district
            binding.ivTroupe.setImageResource(troupe.imageResId)
            
            // Vary the height of the image slightly for staggered effect
            val layoutParams = binding.ivTroupe.layoutParams
            layoutParams.height = if (adapterPosition % 2 == 0) 400 else 500
            binding.ivTroupe.layoutParams = layoutParams

            binding.root.setOnClickListener {
                onItemClick(troupe)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TroupeViewHolder {
        val binding = ItemTroupeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TroupeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TroupeViewHolder, position: Int) {
        holder.bind(troupes[position])
    }

    override fun getItemCount(): Int = troupes.size

    fun updateData(newTroupes: List<Troupe>) {
        troupes = newTroupes
        notifyDataSetChanged()
    }
}
