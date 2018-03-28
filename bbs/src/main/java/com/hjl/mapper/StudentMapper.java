package com.hjl.mapper;

import com.hjl.entity.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from t_accoumt where id = #{id}")
    Student findById(int id);
    Student findByIdWithTag(int id);
    List<Student> findByAll();

}
