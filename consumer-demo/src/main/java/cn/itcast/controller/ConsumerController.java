package cn.itcast.controller;

import cn.itcast.feign.UserClient;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class ConsumerController {

   /* @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;*/

   @Autowired
   private UserClient userClient;

    @GetMapping("{id}") //@HystrixCommand(fallbackMethod = "fallbackMethod")
    public User queryById(@PathVariable("id") Long id){

       /* List<ServiceInstance> serviceInstances = discoveryClient.getInstances("user-service");

        System.out.println(serviceInstances);

        ServiceInstance instance = serviceInstances.get(0);

        String url= String.format("http://%s:%s/user/%s",instance.getHost(),instance.getPort(),id);*/

        //String url = "http://localhost:8081/user/" + id;

       /* if (id==1){
            throw new RuntimeException("系统繁忙");
        }*/
       // String  url="http://user-service/user/"+id;
        // 调用RestTemplate的getForObject方法，指定url地址和返回值类型
       // return restTemplate.getForObject(url, User.class);
        return userClient.queryById(id);
    }

    /*public User fallbackMethod(Long id){
        return "系统繁忙"+id;
    }*/

}