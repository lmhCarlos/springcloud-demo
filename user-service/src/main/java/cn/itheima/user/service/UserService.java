package cn.itheima.user.service;


import cn.itheima.user.mapper.UserMapper;
import cn.itheima.user.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}