package com.zfx.dao.impl;

import com.zfx.dao.IStudentDAO;
import com.zfx.pojo.StudentSSH;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/6/8 0008 22:30
 */
@Repository
public class StudentDAOImpl implements IStudentDAO {

    //注入sessionFactory工厂
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int add(StudentSSH studentSSH) {
        Serializable count = sessionFactory.getCurrentSession().save(studentSSH);
        return (Integer) count;
    }

    @Override
    public void update(StudentSSH studentSSH) {
        sessionFactory.getCurrentSession().update(studentSSH);
    }
}
