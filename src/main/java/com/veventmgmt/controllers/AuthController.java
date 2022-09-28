package com.veventmgmt.controllers;

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

public class AuthController {
    
    @Autowired
    private AuthService u;
    
    @RequestMapping(method=RequestMethod.POST,value="/aserPresent")
    public boolean isUserPresent(@RequestBody LoginModel data){

        UserModel user=u.getUserByEmail(data.getEmail());
        if(user!=null){
            return user.getPassword()==data.getPassword();
        }
        else{
            return false;
        }

    }

    @RequestMapping(method=RequestMethod.POST,value="/adminPresent")
    public boolean isAdminPresent(LoginModel data){
        AdminModel user=u.getAdminByEmail(data.getEmail());
        if(user!=null){
            return user.getPassword()==data.getPassword();
        }
        else{
            return false;
        }
    }

    @RequestMapping(method=RequestMethod.POST,value="/saveUser")
    public void saveUser(UserModel user){
        u.addUser(user);
    }
    @RequestMapping(method=RequestMethod.POST,value="/saveAdmin")
    public void saveAdmin(AdminModel user){
        u.addAdmin(user);
    }

}
