package com.student.service.impl;

import com.student.model.Faculty;
import com.student.repository.FacultyRepository;
import com.student.service.FacultyService;

import java.util.List;

public class FacultyServiceImpl  implements FacultyService {
    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public List<Faculty> getFacultys() {
        return (List<Faculty>) facultyRepository.findAll();
    }

    @Override
    public void deleteFacultyById(long id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }
}
