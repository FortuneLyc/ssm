package org.lyc.platform.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("platform/sys/user")
public class UserController {

    @RequestMapping("/test")
    @ResponseBody
    public Map test(@RequestParam Map qmap)
    {
        return qmap;
    }

}
