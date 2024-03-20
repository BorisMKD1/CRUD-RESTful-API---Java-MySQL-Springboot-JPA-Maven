package com.firstCRUD.app.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstCRUD.app.rest.models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
