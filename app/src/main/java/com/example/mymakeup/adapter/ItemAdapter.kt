package com.example.mymakeup.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymakeup.R
import com.example.mymakeup.UserDetailActivity
import com.example.mymakeup.model.Permit

class ItemAdapter(private val data: List<Permit>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val nameView: TextView = view.findViewById(R.id.nameTV)
        private val profileView: TextView = view.findViewById(R.id.profileDescTV)
        private val profileIcon: ImageView = view.findViewById(R.id.profileIcon) // Add reference to ImageView

        fun bind(permit: Permit) {
            nameView.text = permit.name
            profileView.text = "Brand: ${permit.brand} - Shade: ${permit.shade}"
            profileIcon.setImageResource(permit.imageResId) // Set image resource

            view.setOnClickListener {
                val context = itemView.context
                val showUserIntent = Intent(context, UserDetailActivity::class.java).apply {
                    putExtra(UserDetailActivity.USER_PERMIT, permit)
                }
                context.startActivity(showUserIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(data[position])
    }
}
