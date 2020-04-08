package com.example.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @Author: sweet
 * @Description: 用户实体类
 * @Date: 2020/4/7 12:05
 * @Param
 * @return
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @Size(min = 5, max = 16)
    private String username;

    @Size(min = 5, max = 16)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}