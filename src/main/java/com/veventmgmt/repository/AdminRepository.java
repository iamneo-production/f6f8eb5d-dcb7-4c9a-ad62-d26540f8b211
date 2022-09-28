package com.veventmgmt.repository;
import org.springframework.data.repository.CrudRepository;
import com.veventmgmt.models.*;
public interface AdminRepository extends CrudRepository<AdminModel,String> {
	public abstract AdminModel findByEmail(String email);
}