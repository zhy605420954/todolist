package com.example.todolistdemo.controller;


import com.example.todolistdemo.mapper.UserMapper;
import com.example.todolistdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList =userMapper.queryUserList();
        for(User user :userList){
            System.out.println(user);
        }
        return userList;
    }

    @GetMapping("/queryUserById/{Id}")
    public User queryUserById(@PathVariable("Id") int Id){

       return userMapper.queryUserById(Id);

    }

    @GetMapping("/deleteUser/{Id}")
    public String deleteUser(@PathVariable("Id") int Id){
        userMapper.deleteUser(Id);
        return "Delete OK";

    }

    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(7,"zhang","111111"));
        return "ok";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(7,"laoba","111111"));
        return "Update OK";
    }



}
