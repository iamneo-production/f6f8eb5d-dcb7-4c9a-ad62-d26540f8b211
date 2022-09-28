package com.veventmgmt.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.veventmgmt.models.*;
import com.veventmgmt.repository.*;
import java.util.*;


public class ThemeService {

    @Autowired
    private ThemeRepository themeRepo;

    public void addTheme(ThemeModel data){
        themeRepo.save(data);
    }
    public ThemeModel getTheme(int themeId){
        return themeRepo.findById(themeId).get();
    }
    public void editTheme(int themeId,ThemeModel t){
        themeRepo.save(t);
    }
    public void deleteTheme(int themeId){
        ArrayList<ThemeModel>l=new ArrayList<>();
        for(ThemeModel u1:themeRepo.findAll()){
            if(u1.getThemeId()==themeId){
                l.add(u1);
            }
        }
        for(ThemeModel u2:l){
            themeRepo.save(u2);
        }
    }
}
