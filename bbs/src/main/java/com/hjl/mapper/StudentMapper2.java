package com.hjl.mapper;

import com.hjl.entity.Student;

import java.util.List;

public interface StudentMapper2 {

    Student findById(int id);
    Student findByIdWithTag(int id);
    List<Student> findByAll();

}
