package com.veventmgmt.services;



import org.springframework.beans.factory.annotation.Autowired;

import com.veventmgmt.models.*;
import com.veventmgmt.repository.*;
import java.util.*;

public class FoodService {

    @Autowired
    private MenuRepository menuRepo;
    public void addMenu(MenuModel data){
        menuRepo.save(data);
    }
    public void editMenu(int menuId,MenuModel m){
        menuRepo.save(m);
    }
    public MenuModel getMenu(int menuId){
        return menuRepo.findById(menuId).get();
    }
    public void deleteMenu(int menuId){
        ArrayList<MenuModel>l=new ArrayList<>();
        for(MenuModel u1:menuRepo.findAll()){
            if(u1.getFoodMenuId()==menuId){
                l.add(u1);
            }
        }
        for(MenuModel u2:l){
            menuRepo.save(u2);
        }
    } 
    
}
