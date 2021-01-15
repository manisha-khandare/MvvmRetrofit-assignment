package com.example.mvvmretrofitapplication.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmretrofitapplication.R
//import com.example.mvvmretrofitapplication.data.model.Media
import com.example.mvvmretrofitapplication.data.model.User

class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewUserName = itemView.findViewById<TextView>(R.id.textViewUserName)
        var textViewUserEmail = itemView.findViewById<TextView>(R.id.textViewUserEmail)
        var imageViewAvatar = itemView.findViewById<ImageView>(R.id.imageViewAvatar)
        fun bind(user: User) {
            itemView.apply {
                textViewUserName.text = user.name
                textViewUserEmail.text =user.email
                Glide.with(imageViewAvatar.context)
                        .load(user.avatar)
                        .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
            DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false))

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}
