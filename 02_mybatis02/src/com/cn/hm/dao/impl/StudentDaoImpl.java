package com.cn.hm.dao.impl;

import com.cn.hm.dao.StudentDao;
import com.cn.hm.domain.Student;
import com.cn.hm.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {


    @Override
    public Student getById(String id) {
        SqlSession session = SqlSessionUtil.getSession();
        Student student = session.selectOne("test1.getById", id);

        return student;
    }

    @Override
    public void save(Student student) {
        SqlSession session = SqlSessionUtil.getSession();
        session.insert("test1.save", student);

        //session.commit();//在业务层提交事务：Service

    }
}
