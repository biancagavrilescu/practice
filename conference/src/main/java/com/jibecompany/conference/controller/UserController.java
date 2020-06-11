package com.jibecompany.conference.controller;


import com.jibecompany.conference.model.Registration;
import com.jibecompany.conference.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Bryan") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Hansen") String lastname,
                        @RequestParam(value = "age", defaultValue = "43") int age) {
        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname: "+user.getFirstName());

        return user;
    }


}
