package com.example.kalavidarabalaga.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kalavidarabalaga.R

class GalleryAdapter(private val count: Int) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {

    inner class GalleryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.iv_gallery_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gallery, parent, false)
        return GalleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        // Vary height for staggered layout
        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = if (position % 3 == 0) 450 else 300
        holder.itemView.layoutParams = layoutParams
    }

    override fun getItemCount(): Int = count
}
