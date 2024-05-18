package com.ml.controller;
import com.ml.pojo.*;
import com.ml.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;

  @PostMapping("/register")
  @ResponseBody
  public boolean registerUser(@RequestParam("username") String username,
          @RequestParam("password") String password) {
      // 创建用户对象
      User user = new User();
      user.setUsername(username);
      user.setPassword(password);
      // 注册用户
      return userService.registerUser(user);
  }
    @PostMapping("/login")
    @ResponseBody
    public boolean loginUser(@RequestParam("username") String username,
            @RequestParam("password") String password) {

        return userService.validateUserLogin(username, password);
    }
  
}
