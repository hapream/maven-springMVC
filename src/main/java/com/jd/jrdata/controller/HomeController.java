package com.jd.jrdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangyanggang on 2017/7/1.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/react/demo")
    public String reactDemo() {
        return "index1";
    }

    @RequestMapping(value = "/react/demo/red")
    public String reactDemoRed() {
        return "index2";
    }
    @RequestMapping(value = "/react/demo/event")
    public String reactDemoEvent(){
        return "index3";
    }

    @RequestMapping(value = "/react/demo/app")
    public String reactDemoApp(){
        return "index4";
    }
}
