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

public class ThemeController {
    
    @Autowired
    private ThemeService themeService;


    @RequestMapping(method=RequestMethod.POST,value="/addTheme")
    public void addTheme(@RequestBody ThemeModel data){
        themeService.addTheme(data);
    }
    @RequestMapping("/getTheme/{id}")
    public ThemeModel getTheme(@PathVariable int themeId){
        return themeService.getTheme(themeId);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/editTheme")
    public void editTheme(@PathVariable int themeId,@RequestBody ThemeModel t){
        themeService.editTheme(themeId, t);;
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/deleteTheme")
    public void deleteTheme(@PathVariable int themeId){
        themeService.deleteTheme(themeId);
    }

}
