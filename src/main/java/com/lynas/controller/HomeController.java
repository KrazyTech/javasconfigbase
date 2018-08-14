package com.lynas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * Created by navaraj on 6/16/2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/")
    public String home(){
        return "home";
    }

}
