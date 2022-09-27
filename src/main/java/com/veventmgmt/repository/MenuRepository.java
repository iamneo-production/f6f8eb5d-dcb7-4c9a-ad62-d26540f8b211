package com.veventmgmt.repository;
import org.springframework.data.repository.CrudRepository;
import com.veventmgmt.models.*;
public interface MenuRepository extends CrudRepository<MenuModel,Integer> {
	
}