package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String age;

    public Student() {
    }

    public Student(Long Id, String Name, String Age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String Age) {
        this.age = Age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Age='" + age + '\'' +
                '}';
    }
}