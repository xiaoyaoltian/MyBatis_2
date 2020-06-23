package com.cn.hm.service;

import com.cn.hm.domain.Student;

public interface StudentService {

    public Student getById(String id);

    public void save(Student student);

}
