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
    
    public void addUser(UserModel data){
        return;
    }
    public List<UserModel> getUser(String userId){
        return null;
    }
    public void editUser(String userId){
        return;
    }
    public void deleteUser(String userId){
        return;
    }

}
