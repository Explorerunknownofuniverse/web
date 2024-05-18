package com.ml.mapper;
import com.ml.pojo.*;
public interface UserMapper {

  boolean insertuser(User user);


  boolean selectuser(String username,String password);
}
