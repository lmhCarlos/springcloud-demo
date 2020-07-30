package cn.itheima.user.controller;

import cn.itheima.user.pojo.User;
import cn.itheima.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id, HttpServletRequest request) {
        String truth = request.getHeader("truth");
        System.out.println(truth);
        return userService.queryById(id);
    }
}