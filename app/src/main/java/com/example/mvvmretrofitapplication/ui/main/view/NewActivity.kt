package com.example.mvvmretrofitapplication.ui.main.view

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmretrofitapplication.R
import com.example.mvvmretrofitapplication.data.api.ApiHelper
import com.example.mvvmretrofitapplication.data.api.RetrofitBuilder
import com.example.mvvmretrofitapplication.data.model.MyClas
import com.example.mvvmretrofitapplication.databinding.ActivityMainBinding
import com.example.mvvmretrofitapplication.ui.base.ViewModelFactory
import com.example.mvvmretrofitapplication.ui.main.adapter.MainAdapter
import com.example.mvvmretrofitapplication.ui.main.viewmodel.MainViewModel
import com.example.mvvmretrofitapplication.utils.Status

class NewActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)


        }
}
