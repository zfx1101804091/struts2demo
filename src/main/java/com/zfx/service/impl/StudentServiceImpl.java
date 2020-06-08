package com.zfx.service.impl;

import com.zfx.dao.IStudentDAO;
import com.zfx.pojo.StudentSSH;
import com.zfx.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/6/8 0008 22:27
 */
@Service("studentService")
@Transactional
public class StudentServiceImpl implements IStudentService {
    
    @Autowired
    private IStudentDAO iStudentDAO;
    
    @Override
    public int add(StudentSSH studentSSH) {
        
        return iStudentDAO.add(studentSSH);
    }
}
