package com.cn.hm.dao;

import com.cn.hm.domain.Student;

public interface StudentDao {

    public Student getById(String id);

    public void save(Student student);
}
