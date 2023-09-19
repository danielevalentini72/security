package sistinf.course.springappsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protected")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!!";
    }


}
