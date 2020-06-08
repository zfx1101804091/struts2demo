package com.zfx.service;

import com.zfx.pojo.StudentSSH;

public interface IStudentService {

    /**
     *  添加学生
     * @param studentSSH
     * @return
     */
    public int add(StudentSSH studentSSH);

    /**
     * 修改
     * @return
     */
    void update(StudentSSH studentSSH);
}
