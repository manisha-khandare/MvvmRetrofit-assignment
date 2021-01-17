package com.example.mvvmretrofitapplication.ui.main.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmretrofitapplication.R
import com.example.mvvmretrofitapplication.data.model.MyClas
import com.example.mvvmretrofitapplication.data.model.MyClasItem
import com.example.mvvmretrofitapplication.data.model.UserX

//import com.example.mvvmretrofitapplication.data.model.Media

class MainAdapter(private val myClas: MyClas) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var textViewUserName = itemView.findViewById<TextView>(R.id.textViewUserName)
        var textViewContent = itemView.findViewById<TextView>(R.id.textViewContent)
        var textViewUserComments = itemView.findViewById<TextView>(R.id.textViewComments)
        var textViewUserEmail = itemView.findViewById<TextView>(R.id.textViewUserEmail)
        var textViewLikes = itemView.findViewById<TextView>(R.id.TextViewLikes)
        var textViewUrl = itemView.findViewById<TextView>(R.id.textViewUrl)
        var imageViewArticle = itemView.findViewById<ImageView>(R.id.imageViewArticle)

        fun bind(item: MyClasItem) {
            itemView.apply {
                textViewUserName.text = item.likes.toString()
               //  textViewUserName.text= item.user[0].city
               // textViewUserEmail.text = item.content.toString()
                textViewContent.text = item.content.toString()
                textViewLikes.text ="Likes : "+ item.likes.toString()
                textViewUserComments.text ="Comments : "+ item.comments.toString()
                textViewUserName.text =item.user[0].lastname
                textViewUserEmail.text =item.user[0].designation
             //   textViewUrl.text ="URL : "+item.media[0].url!!
                Glide.with(imageViewArticle.context)
                        .load(item.media[0].image)
                        .into(imageViewArticle)

                Log.d("aaa: ",item.media[0].image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
            DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false))

    override fun getItemCount(): Int = myClas.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(myClas[position]!!)


    }

    fun addData(myClas: MyClas) {
        this.myClas.apply {
            clear()
            addAll(myClas)
        }

    }
}
