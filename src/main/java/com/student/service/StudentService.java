package com.student.service;


import com.student.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    Student getStudentById(long id);
    List<Student> getStudents();
    void deleteStudentById(long id);
    Student updateStudent(Student student);
    List<Student> getStudentsByName(String name);
}