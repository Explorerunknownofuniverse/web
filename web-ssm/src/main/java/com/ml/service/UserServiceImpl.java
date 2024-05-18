package com.ml.service;
import com.ml.pojo.*;
import com.ml.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
  @Autowired
    private UserMapper userDAO;
  @Override
    public boolean registerUser(User user) {
       return userDAO.insertuser(user);
    }
  @Override
    public boolean validateUserLogin(String username, String password) {
      return userDAO.selectuser(username,password);
  }
}
