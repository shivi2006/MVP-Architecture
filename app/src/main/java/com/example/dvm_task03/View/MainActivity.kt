package com.example.dvm_task03.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dvm_task03.Contract
import com.example.dvm_task03.Presenter.Presenter
import com.example.dvm_task03.R
import com.example.dvm_task03.Repository
import com.example.dvm_task03.Retrofit.DataClass2
import com.example.dvm_task03.Room.DataClasss
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var recyclerView: RecyclerView
    lateinit var presenter:Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        presenter=Presenter(Repository())
        button.setOnClickListener{
                val finalList=presenter.fetchData(this)
                val adapter=CustomAdapter(finalList,this)
                recyclerView.adapter=adapter

            }
        }
    }
