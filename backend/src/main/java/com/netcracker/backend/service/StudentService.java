package com.netcracker.backend.service;


import com.netcracker.backend.entity.Student;

import java.util.List;

public interface StudentService {
    Student find (String name);
    List<Student> getAll();
}
