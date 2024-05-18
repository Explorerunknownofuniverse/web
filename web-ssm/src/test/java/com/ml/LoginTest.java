package com.ml;
import com.ml.service.UserService;
import com.ml.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class LoginTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testLogin() {
        String username = "User1";
        String password = "123456";

        boolean result = userService.validateUserLogin(username, password);

        if(result) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
    }
}
