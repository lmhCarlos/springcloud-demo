package cn.itheima.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {

    @RequestMapping("me")
    public String Address(){
        return "这是浦东信息的地址";
    }
}
