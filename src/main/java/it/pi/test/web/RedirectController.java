package it.pi.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: test
 * @author: Mr.Pi
 * @create: 2018-08-20 20:53
 **/
@RequestMapping("/frontend")
@Controller
public class RedirectController {

     @GetMapping(value = "/index")
     public String getIndex(){
         return "/index";
     }
}
