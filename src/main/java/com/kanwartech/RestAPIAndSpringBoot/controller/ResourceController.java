package com.kanwartech.RestAPIAndSpringBoot.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kanwartech.RestAPIAndSpringBoot.dao.UserDaoService;
import com.kanwartech.RestAPIAndSpringBoot.exceptionalhandler.UserNotFoundException;
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
        User user = service.getUserId(Integer.valueOf(id));
        if(user == null){
            throw  new UserNotFoundException("id..."+id);
        }
       return user ; 
    }
    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User savedUser = service.addUser(user);
        URI  location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri() ;
        return ResponseEntity.created(location).build();
    } 
    @DeleteMapping("users/user-delete/{id}")
    public void deleteUser(@PathVariable String id){
        service.deleteUser(Integer.valueOf(id));
    }


}
