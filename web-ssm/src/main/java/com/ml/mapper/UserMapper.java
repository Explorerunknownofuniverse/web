package com.ml.mapper;
import com.ml.pojo.*;
public interface UserMapper {

  boolean insertuser(User user);

  User selectid(Long id);

  User selectname(String username);
}
