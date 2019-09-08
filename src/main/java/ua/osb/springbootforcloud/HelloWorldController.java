package ua.osb.springbootforcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping
    public String helloMessage() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/env")
    public Properties getEnv() {
        return System.getProperties();
    }
}
