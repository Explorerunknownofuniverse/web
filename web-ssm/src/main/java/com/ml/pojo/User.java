package com.ml.pojo;

import lombok.Setter;
import lombok.Getter;
@Getter
@Setter
public class User {
    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // get与set方法
}
