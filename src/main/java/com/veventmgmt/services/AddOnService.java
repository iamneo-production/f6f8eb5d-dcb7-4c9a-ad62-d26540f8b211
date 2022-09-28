package com.veventmgmt.services;

import com.veventmgmt.models.*;
import com.veventmgmt.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
public class AddOnService {

    @Autowired
    private AddOnRepository addonobj;
    
    public void addAddOn(AddOnModel data){
        addonobj.save(data);
    }
    public void editAddOn(int addonId,AddOnModel data){
        addonobj.save(data);
    }
    public AddOnModel getAddOn(int addOnId){
        return addonobj.findById(addOnId).get();
    }
    public void deleteAddOn(int addOnId){
		//addonobj.remove(addonobj.findById(addOnId).get());
        return ;
    }
    
}
