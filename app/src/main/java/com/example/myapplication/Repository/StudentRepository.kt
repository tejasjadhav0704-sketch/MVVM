package com.example.myapplication.Repository

import com.example.myapplication.Model.Students

class StudentRepository {
    private val students = mutableListOf(
        Students("a",20),
        Students("b",21),
        Students("c",22),
        Students("d",23),
        Students("e",24),
        Students("f",25)
    )

    fun addstudents(stu : Students)
    {
        students.add(stu)
    }
    fun getStudents() : List<Students>
    {
        return students
    }

}