package com.codingaap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @RequestMapping(value="/show",method = RequestMethod.GET)
    public String result(ModelMap mp, @RequestParam String name,@RequestParam String password){
        mp.put("name",name);
        mp.put("password",password);
        return "result";
    }
}
