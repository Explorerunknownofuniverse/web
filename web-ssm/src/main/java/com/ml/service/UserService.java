package com.ml.service;
import com.ml.pojo.User;
public interface  UserService {
  //用户注册
  boolean registerUser(User user);
  //用户登陆验证
  boolean validateUserLogin(String username, String password);
}
