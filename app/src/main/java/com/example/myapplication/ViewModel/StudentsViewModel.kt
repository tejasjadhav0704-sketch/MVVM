package com.example.myapplication.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Model.Students
import com.example.myapplication.Repository.StudentRepository

class StudentsViewModel : ViewModel()
{
    private  val repository = StudentRepository()
    private val _Students = MutableLiveData<List<Students>>()
    val Students : LiveData<List<Students>> get() = _Students

    fun addstudents(stu : Students)
    {
        repository.addstudents(stu)
        _Students.value = repository.getStudents()
    }
    fun getStudents()
    {
         _Students.value = repository.getStudents()
    }
}