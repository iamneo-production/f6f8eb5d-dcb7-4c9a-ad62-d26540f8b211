package com.veventmgmt.controllers;

import com.veventmgmt.models.*;
import com.veventmgmt.repository.*;

import com.veventmgmt.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddOnController {

    @Autowired
    private AddOnService addonobj;

    @RequestMapping(method=RequestMethod.POST,value="/addOn")
    public void addAddon(@RequestBody AddOnModel data){
        addonobj.addAddOn(data);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/addOn/{id}")
    public void editAddOn(@PathVariable int addonId,@RequestBody AddOnModel data){
        addonobj.editAddOn(addonId, data);;
    }

    @RequestMapping("/addOn/{id}")
    public AddOnModel getAddOn(@PathVariable  int addOnId){
        return addonobj.getAddOn(addOnId);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/addOn/{id}")
    public void deleteAddOn(@PathVariable int addOnId){
		//addonobj.remove(addonobj.findById(addOnId).get());
        addonobj.deleteAddOn(addOnId);
    }

}
