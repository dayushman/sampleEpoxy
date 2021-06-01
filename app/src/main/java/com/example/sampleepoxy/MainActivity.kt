package com.example.sampleepoxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.epoxy.carousel
import com.example.sampleepoxy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val studentList = ArrayList<Student>()
        studentList.add(Student("Ayushman DUbe","5011"))
        studentList.add(Student("Sankalp Rai","5012"))
        studentList.add(Student("Abhinav Singh","5013"))
        studentList.add(Student("Vikash Patel","5014"))
        studentList.add(Student("Sachin Dev","5015"))

        /*binding.rvRollList.withModels {
            studentList.forEach{ student ->
                student {
                    id(student.rollNo)
                    student(student)
                }
            }
        }*/
        val adaptor = StudentAdaptor()
        adaptor.addStudents(studentList)
        binding.rvRollList.adapter = adaptor
    }
}


/*val studentModels = studentList?.map {
                StudentBindingModel_()
                    .id(it.rollNo)
                    .student(it)
            }

            carousel {
                id("students")
                if (studentModels != null) {
                    models(studentModels)
                }
            }
            */