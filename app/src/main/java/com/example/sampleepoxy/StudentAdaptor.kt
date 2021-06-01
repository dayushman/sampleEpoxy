package com.example.sampleepoxy

import com.airbnb.epoxy.EpoxyAdapter

class StudentAdaptor: EpoxyAdapter() {

    fun addStudents(studentList:List<Student>){
        studentList.forEach {
            addModel(StudentBindingModel_()
                .student(it))
        }
    }
}