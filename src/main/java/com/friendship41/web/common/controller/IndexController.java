package com.friendship41.web.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @RequestMapping(value = "/")
    public String goToIndexPage(){
        return "index.html";
    }
}
