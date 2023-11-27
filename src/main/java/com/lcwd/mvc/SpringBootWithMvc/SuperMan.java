package com.lcwd.mvc.SpringBootWithMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping
public class SuperMan {

    /*

    /about
    @RequestMapping this annotation is used for mapping  URl with  method

    */

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutRequestHeader() {
        System.out.println("Processing about to request");
        return "about";
    }

}
