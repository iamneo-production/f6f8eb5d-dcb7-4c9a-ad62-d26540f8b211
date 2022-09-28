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

public class FoodMenuController {

    @Autowired
    private FoodService foodService;
    @RequestMapping(method=RequestMethod.POST,value="/addMenu")
    public void addMenu(@RequestBody MenuModel data){
        foodService.addMenu(data);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/editMenu")
    public void editMenu(@PathVariable int menuId,@RequestBody MenuModel data){
        foodService.editMenu(menuId,data);
    }
    @RequestMapping(value="/getMenu")
    public MenuModel getMenu(@PathVariable int menuId){
        return foodService.getMenu(menuId);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteMenu")
    public void deleteMenu(@PathVariable int menuId){
        foodService.deleteMenu(menuId);
    } 

}
