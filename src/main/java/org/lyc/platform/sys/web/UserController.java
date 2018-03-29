package org.lyc.platform.sys.web;

import org.lyc.framework.redis.RedisTakes;
import org.lyc.platform.sys.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("platform/sys/user")
public class UserController {

    @Autowired
    private RedisTakes<String,String,User> redisTakes;

    @RequestMapping("/test")
    @ResponseBody
    public Map test(@RequestParam Map qmap)
    {
        return qmap;
    }

    @RequestMapping("/redisTest")
    @ResponseBody
    public User redisTest()
    {
        User user=new User();
        /*redisTakes.add("user",user.getUser_id(),user);
        User user1 =  redisTakes.get("user",user.getUser_id());*/
        user.setUser_name("leiq");
        user.setPass_answer("123");
        return user;
    }

}
