package com.zfx.pojo;

import javax.persistence.*;

/**
 * @description:
 * @author: zheng-fx
 * @time: 2020/6/8 0008 22:20
 */
@Entity
@Table
public class StudentSSH {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name",length = 255,columnDefinition = "VARCHAR(200) COMMENT  '名称'")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
