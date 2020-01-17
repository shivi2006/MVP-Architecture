package com.example.dvm_task03.View

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dvm_task03.R
import com.example.dvm_task03.Room.DataClasss
import kotlinx.android.synthetic.main.list.view.*

class CustomAdapter(var theList:MutableList<DataClasss>, val context: Context): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){


    override fun getItemCount(): Int {
        return theList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list,parent,false))
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val value=theList.get(position)
        holder.date.text=value.date
        holder.id.text=value.id
    }

    class ViewHolder(itemLayoutView: View): RecyclerView.ViewHolder(itemLayoutView){
        val date=itemLayoutView.findViewById<TextView>(R.id.date)
        val id=itemLayoutView.findViewById<TextView>(R.id.id)
    }

}

