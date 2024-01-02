package com.dreamTeam.restTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/rest-test")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Test rest app ";
    }
}
