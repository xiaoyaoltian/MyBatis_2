package com.cn.hm.service.impl;

import com.cn.hm.dao.StudentDao;
import com.cn.hm.dao.impl.StudentDaoImpl;
import com.cn.hm.domain.Student;
import com.cn.hm.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = new StudentDaoImpl();//多态

    @Override
    public Student getById(String id) {
        Student student = studentDao.getById(id);

        return student;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }
}
