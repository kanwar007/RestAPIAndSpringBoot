package com.kanwartech.RestAPIAndSpringBoot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kanwartech.RestAPIAndSpringBoot.dao.UserDaoService;
import com.kanwartech.RestAPIAndSpringBoot.model.User;

@RestController
public class ResourceController {
    UserDaoService service; 
     public ResourceController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return service.getUserList();

    }

    @GetMapping("users/{id}")
    public User getUser(@PathVariable String id)
    {
       return service.getUserId(Integer.valueOf(id)) ; 
    }
    @PostMapping("users/user-add")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    } 
    @DeleteMapping("users/user-delete/{id}")
    public void deleteUser(@PathVariable String id){
        service.deleteUser(Integer.valueOf(id));
    }


}
