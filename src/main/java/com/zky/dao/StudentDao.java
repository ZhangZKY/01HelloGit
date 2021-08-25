package com.zky.dao;

import com.zky.entity.Student;

import java.util.List;

public interface StudentDao {
    int insertStu();
    List<Student> selectStu();

}
