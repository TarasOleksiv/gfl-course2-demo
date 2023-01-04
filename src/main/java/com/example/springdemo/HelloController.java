package com.example.springdemo;

import com.example.springdemo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value="api/test")
//http://localhost:8085/api/test
public class HelloController {

    @GetMapping(value = "/hello", produces = "Application/json")
    //http://localhost:8085/api/test/hello
    public User index() {
        return new User("John", LocalDateTime.now());
    }

    @GetMapping(value = "/id", produces = "Application/json")
    //http://localhost:8085/api/test/id?name=Andrew
    public User getUserById(@RequestParam(name="name") String str) {
        return new User(str, LocalDateTime.now());
    }

    @GetMapping(value = "/{userName}", produces = "Application/json")
    //http://localhost:8085/api/test/Andrew
    public User getUserByName(@PathVariable(name="userName") String str) {
        return new User(str, LocalDateTime.now());
    }

    @PostMapping(value = "/addUser", produces = "Application/json")
    //http://localhost:8085/api/test/addUser
    public User saveUser(@RequestBody User user) {
        return user;
    }
}
