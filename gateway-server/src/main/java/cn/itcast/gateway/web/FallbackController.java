package cn.itcast.gateway.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallbackController {


    @RequestMapping("/fallbackTest")
    public Map<String,String> FallbackController(){
        Map<String,String> responce=new HashMap<>();
        responce.put("code","502");
        responce.put("msg","服务超时");
        return responce;
    }
}
