package com.example.myapplication.View

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Students
import com.example.myapplication.R
import com.example.myapplication.ViewModel.StudentsViewModel
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewmodel : StudentsViewModel by viewModels()
    private lateinit var adapter: StudentsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.recycleview.layoutManager = LinearLayoutManager(this)
        adapter = StudentsAdapter(emptyList())
        binding.recycleview.adapter = adapter

        viewmodel.addstudents(
            Students("h",26)
        )

        viewmodel.Students.observe(this) { data ->
            adapter.updateData(data)
        }

        viewmodel.getStudents()
    }
}