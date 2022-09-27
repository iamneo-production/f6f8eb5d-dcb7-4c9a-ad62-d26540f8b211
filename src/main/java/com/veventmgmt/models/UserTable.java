package com.veventmgmt.models;

@RestController
public class UserTable {
    @RequestMapping("admin/login/det")
    public boolean checkLoginDetails(String email,String password){
        
        return true;
    }
}
