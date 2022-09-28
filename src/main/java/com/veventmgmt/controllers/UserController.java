package com.veventmgmt.controllers;

import java.util.*;

import com.veventmgmt.models.*;
import com.veventmgmt.models.*;
import com.veventmgmt.repository.*;

import com.veventmgmt.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
    
    @Autowired
    private AuthService authService;
    @RequestMapping(method=RequestMethod.POST,value="/addUser")
    public void addUser(@RequestBody UserModel data){
        authService.addUser(data);
    }
    @RequestMapping("/getUser/{id}")
    public UserModel getUser(@PathVariable String userId){
        return authService.getUser(userId);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/editUser/{id}")
    public void editUser(@PathVariable String userId,@RequestBody UserModel data){
        authService.editUser(userId, data);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/editTheme/{id}")
    public void deleteUser(@PathVariable String userId){
        authService.deleteUser(userId);
    }

}
