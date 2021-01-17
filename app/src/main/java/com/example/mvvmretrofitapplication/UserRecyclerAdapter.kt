package com.example.mvvmretrofitapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofitapplication.data.model.MyClas
import com.example.mvvmretrofitapplication.data.model.MyClasItem
import com.example.mvvmretrofitapplication.databinding.ItemViewBinding
import com.example.mvvmretrofitapplication.ui.main.adapter.MainAdapter

public class UserRecyclerAdapter/*(myClas: MyClas) : RecyclerView.Adapter<MainAdapter.DataViewHolder?>() {
    var myClas:MyClas
    @NonNull
    fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): MainAdapter.DataViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.getContext())
        val itemViewBinding:ItemViewBinding =
            ItemViewBinding.inflate(layoutInflater, parent, false)
        return MainAdapter.DataViewHolder(itemViewBinding)
    }

    fun onBindViewHolder(@NonNull holder: MainAdapter.DataViewHolder, position: Int) {
        val myClasItem: MyClasItem = myClas[position]
        *//*holder.im.setUser(myClasItem)
        holder.productRowBinding.executePendingBindings()*//*
    }



    internal inner class UserViewHolder(@NonNull itemViewBinding: ItemViewBinding) :
        RecyclerView.ViewHolder(itemViewBinding.getRoot()) {
        var itemViewBinding: ItemViewBinding

        init {
            this.itemViewBinding = itemViewBinding*//*
            productRowBinding.activeButton.setOnClickListener(object : OnClickListener() {
                fun onClick(v: View?) {
                    Log.d(TAG, "onClick: " + userList[getAdapterPosition()])
                }
            })*//*
        }
    }

    companion object {
        private const val TAG = "UserRecyclerAdapter"
    }

    init {
        this.myClas = myClas
    }

   *//* override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }*//*
}

*/