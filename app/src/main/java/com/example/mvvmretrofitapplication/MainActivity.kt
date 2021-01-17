package com.example.mvvmretrofitapplication

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
//import com.example.mvvmretrofitapplication.R.layout
import com.example.mvvmretrofitapplication.data.api.ApiHelper
import com.example.mvvmretrofitapplication.data.api.RetrofitBuilder
import com.example.mvvmretrofitapplication.data.model.MyClas
import com.example.mvvmretrofitapplication.databinding.ActivityMainBinding
import com.example.mvvmretrofitapplication.ui.base.ViewModelFactory
import com.example.mvvmretrofitapplication.ui.main.adapter.MainAdapter
import com.example.mvvmretrofitapplication.ui.main.viewmodel.MainViewModel
import com.example.mvvmretrofitapplication.utils.Status.ERROR
import com.example.mvvmretrofitapplication.utils.Status.LOADING
import com.example.mvvmretrofitapplication.utils.Status.SUCCESS
//import kotlinx.android.synthetic.main.activity_user.progressBar
//import kotlinx.android.synthetic.main.activity_user.recyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: MainAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)

        val activityMainBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.getRoot())
        setupViewModel()
        setupUI()
        //setupObservers()
    }


    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelper(RetrofitBuilder.apiService))
        ).get(MainViewModel::class.java)
    }

    private fun setupUI() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter(myClas = MyClas())

        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        recyclerView.adapter = adapter


        viewModel.getMyData().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    SUCCESS -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        resource.data?.let { myClass -> retrieveList(myClass) }
                     //   resource.data?.let { myclassItem -> retrieveList(myclassItem) }
                    }
                    ERROR -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    LOADING -> {
                        progressBar.visibility = View.VISIBLE
                        recyclerView.visibility = View.GONE
                    }
                }
            }
        })
    }

   /* private fun setupObservers() {
        viewModel.getUsers().observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    SUCCESS -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        resource.data?.let { users -> retrieveList(users) }
                    }
                    ERROR -> {
                        recyclerView.visibility = View.VISIBLE
                        progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    LOADING -> {
                        progressBar.visibility = View.VISIBLE
                        recyclerView.visibility = View.GONE
                    }
                }
            }
        })
    }*/

    private fun retrieveList(myClas: MyClas) {
        adapter.apply {
            addData(myClas)
            notifyDataSetChanged()
        }
    }
}
