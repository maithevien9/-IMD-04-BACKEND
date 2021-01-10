package com.student.controller;

import com.student.model.Student;
import com.student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity getStudents() {
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity getStudentById(@PathVariable long id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteStudent(@PathVariable long id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>("Delete student is successfully!", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity updateStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity getStudentsByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(studentService.getStudentsByName(name), HttpStatus.OK);
    }
}