package com.example.myapplication.View

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Students
import com.example.myapplication.R

class StudentsAdapter(var data: List<Students>) : RecyclerView.Adapter<StudentsAdapter.ViewHolder>()
{
    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newData: List<Students>) {
        data = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.student_layout,p0,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.name.text = data[p1].name
        p0.age.text = data[p1].age.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(val itemview : View) : RecyclerView.ViewHolder(itemview)
    {
        val name = itemview.findViewById<TextView>(R.id.stuname)
        val age = itemview.findViewById<TextView>(R.id.stuage)
    }
}