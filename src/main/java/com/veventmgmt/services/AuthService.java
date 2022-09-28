package com.veventmgmt.services;

import com.veventmgmt.repository.AdminRepository;

import com.veventmgmt.models.*;
import com.veventmgmt.repository.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
public class AuthService {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private AdminRepository adminRepo;
    public void addUser(UserModel data){
        userRepo.save(data);
    }
    public void addAdmin(AdminModel data){
        adminRepo.save(data);
    }
    public UserModel getUser(String userId){
        return userRepo.findById(userId).get();
    }
    public UserModel getUserByEmail(String email){
        return userRepo.findByEmail(email);
    }
    public AdminModel getAdminByEmail(String email){
        return adminRepo.findByEmail(email);
    }
    public void editUser(String userId,UserModel data){
        userRepo.save(data);
    }
    public void deleteUser(String userId){
        ArrayList<UserModel>l=new ArrayList<>();
        for(UserModel u1:userRepo.findAll()){
            if(u1.getId()+""==userId){
                l.add(u1);
            }
        }
        for(UserModel u2:l){
            userRepo.save(u2);
        }
    }
}
