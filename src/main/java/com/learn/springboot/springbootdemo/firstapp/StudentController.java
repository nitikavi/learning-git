package com.learn.springboot.springbootdemo.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent()
    {
        return new Student("R","F");
    }

    @GetMapping("/students")

    public List<Student> getStudents(){


        java.util.List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("F","L"));
        studentList.add(new Student("R","F"));
        studentList.add(new Student("R","F"));
        studentList.add(new Student("R","F"));
        return studentList;

    }



}
