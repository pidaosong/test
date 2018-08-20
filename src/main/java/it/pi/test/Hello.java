package it.pi.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: test
 * @author: Mr.Pi
 * @create: 2018-08-20 12:13
 **/
@RestController
public class Hello {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello spring boot";
    }
}
