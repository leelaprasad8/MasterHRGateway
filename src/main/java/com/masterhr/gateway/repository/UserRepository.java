package com.masterhr.gateway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


import com.masterhr.gateway.model.Users;


@Repository
public interface UserRepository extends JpaRepository<Users,Long>,JpaSpecificationExecutor<Users> {
	
	public List<Users> findByName(String name);

}
