package com.veventmgmt.repository;
import org.springframework.data.repository.CrudRepository;
import com.veventmgmt.models.*;
public interface UserRepository extends CrudRepository<UserModel,String> {
	public abstract UserModel findByEmail(String email);
}