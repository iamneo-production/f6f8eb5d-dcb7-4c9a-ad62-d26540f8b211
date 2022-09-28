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
import com.veventmgmt.models.*;

@RestController
public class EventBookingController {

    @Autowired
    private EventService eventService;

    @RequestMapping(method=RequestMethod.POST,value="/addEvent")
    public void bookEvent(@RequestBody EventModel data){
        eventService.bookEvent(data);
    }

    @RequestMapping(value="/viewEvent/{id}")
    public EventModel viewEvent(@PathVariable int eventId){
        return eventService.viewEvent(eventId);
    }
    // public void editEvent(int eventId){
    //     eventService.editEvent(eventId,new EventModel());
    // }

    @RequestMapping(method=RequestMethod.DELETE,value="/delEvent/{id}")
    public void deleteEvent(@PathVariable int eventId){
        eventService.deleteEvent(eventId);
    }

}
