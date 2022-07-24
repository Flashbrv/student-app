package com.example.studentapp.service;

import com.example.studentapp.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
}
