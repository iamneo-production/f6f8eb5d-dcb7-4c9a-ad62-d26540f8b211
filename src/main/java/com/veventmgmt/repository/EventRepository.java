package com.veventmgmt.repository;
import org.springframework.data.repository.CrudRepository;
import com.veventmgmt.models.*;
public interface EventRepository extends CrudRepository<EventModel,Integer> {
	
}