package com.zfx.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zfx.pojo.StudentSSH;
import com.zfx.service.IStudentService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Map;


/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/6/6 0006 13:40
 */
@Controller("studentAction")
@ParentPackage("struts-default")
@Namespace("/")
@Scope("prototype")   //struts为多例   spring为单例
public class StudentAction extends ActionSupport {
    
    private StudentSSH studentSSH;
    private int count;

    public int getCount() {
        return count;
    }

    @Autowired
    IStudentService iStudentService;

    /**
     *  新增
     * @return
     */
    @Action(value = "/add",results = {@Result(name = "success",location = "/jsp/login.jsp")})
    public String add(){
        int count = iStudentService.add(studentSSH);
       /*数据回显相关*/
        ActionContext ac= ActionContext.getContext();
        //1.首先获取到值栈
        Map<String, Object>request=(Map<String, Object>)ac.get("request");
        request.put("count", count);
        return "success";
    }




    public StudentSSH getStudentSSH() {
        return studentSSH;
    }

    public void setStudentSSH(StudentSSH studentSSH) {
        this.studentSSH = studentSSH;
    }
}
