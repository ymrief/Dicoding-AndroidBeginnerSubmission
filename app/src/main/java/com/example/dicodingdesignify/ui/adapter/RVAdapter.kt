package com.example.dicodingdesignify.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodingdesignify.data.DataModels
import com.example.dicodingdesignify.databinding.RvItemsBinding

class RVAdapter: RecyclerView.Adapter<RVAdapter.CustomViewHolder>() {

    lateinit var listener: OnItemClickListener

    inner class CustomViewHolder(private val binding: RvItemsBinding)
        : RecyclerView.ViewHolder(binding.root) {

        fun bindData(image: DataModels) {
            with (binding) {
                tvTitle.text = image.title
                tvArtist.text = image.artist
                ivImage.setImageResource(image.image)
            }
        }
    }

    private var daftarLukisan = mutableListOf<DataModels>()

    fun isiList(list: MutableList<DataModels>) {
        daftarLukisan.clear()
        daftarLukisan.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
       return CustomViewHolder(RvItemsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount(): Int {
        return daftarLukisan.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindData(daftarLukisan[position])
        holder.itemView.setOnClickListener {
            listener.onItemClicked(daftarLukisan[position])
        }
    }

    interface OnItemClickListener {
        fun onItemClicked(item: DataModels)
    }

}