package com.tharuka.aad.user_service.controller;

import com.tharuka.aad.user_service.dto.LoginDTO;
import com.tharuka.aad.user_service.entity.User;
import com.tharuka.aad.user_service.service.UserService;
import com.tharuka.aad.user_service.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add_user")
    public Response addUser(@RequestBody User user) {
        return new Response("Ok","Added..!",userService.addUser(user));
    }

    @PutMapping(value = "/update_user")
    public Response updateUser(@RequestBody User user){
        return new Response("Ok","Updated..!",userService.updateUser(user));
    }

    @DeleteMapping(value = "/delete_user")
    public Response deleteUser(@RequestParam Integer id){
        userService.deleteUser(id);
        return new Response("Ok","User Deleted..!",null);
    }

    @GetMapping(value = "/fetch_users")
    public Response fetchAllUsers() {
        return new Response("OK", "", userService.fetchAllUsers());
    }

    @PostMapping(value = "/check")
    public Response checkLogin(@RequestBody LoginDTO loginDto) {
        return new Response("OK", "Access Granted..!", userService.checkLogin(loginDto.getUserName()
                , loginDto.getPassword()));
    }

    @GetMapping(value = "/search_user")
    public Response searchUser(@RequestParam Integer id ){
        return  new Response("OK","Done..!",userService.searchUser(id));
    }
}
