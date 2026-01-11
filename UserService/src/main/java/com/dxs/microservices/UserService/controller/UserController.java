package com.dxs.microservices.UserService.controller;


import com.dxs.microservices.UserService.entity.UserEntity;
import com.dxs.microservices.UserService.service.UserService;
import com.dxs.microservices.UserService.valueObjects.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public UserEntity saveUser(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
