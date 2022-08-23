// https://www.youtube.com/watch?v=A4iCQYoI4Cs&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=16

package ru.trunov.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }

    // http://localhost:8080/spring_mvc_war/hello-world
}
