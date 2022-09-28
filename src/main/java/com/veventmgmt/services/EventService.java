package com.veventmgmt.services;


import org.springframework.beans.factory.annotation.Autowired;

import com.veventmgmt.models.*;
import java.util.*;
import com.veventmgmt.repository.*;

public class EventService {

    @Autowired
    private EventBookingRepository eventRepo;

    public void bookEvent(EventModel data){
        eventRepo.save(data);
    }
    public EventModel viewEvent(int eventId){
        return eventRepo.findById(eventId).get();
    }
    public void editEvent(int eventId){
        //eventRepo.save(eventId);
        return ;
    }
    public void deleteEvent(int eventId){
        ArrayList<EventModel>l=new ArrayList<>();
        for(EventModel u1:eventRepo.findAll()){
            if(u1.getEventId()==eventId){
                l.add(u1);
            }
        }
        for(EventModel u2:l){
            eventRepo.save(u2);
        }
    }

    
}
