package com.student.service.impl;


import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        return studentRepository.findStudentsByName(name);
    }
}