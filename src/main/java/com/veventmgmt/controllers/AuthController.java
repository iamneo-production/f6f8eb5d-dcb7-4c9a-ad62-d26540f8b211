package com.veventmgmt.controllers;

import com.veventmgmt.models.*;

public class AuthController {
    
    public boolean isUserPresent(LoginModel data){
        return true;
    }

    public boolean isAdminPresent(LoginModel data){
        return true;
    }
    public void saveUser(UserModel user){
        return;
    }
    public void saveAdmin(UserModel user){
        return;
    }

}
