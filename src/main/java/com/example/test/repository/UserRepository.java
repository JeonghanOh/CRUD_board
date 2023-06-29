package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test.entity.usertbl;

public interface UserRepository  extends JpaRepository<usertbl, Long>   {
	@Query(value = "select user_pw from userTbl where user_email=?1", nativeQuery = true)
	public String getPassword(String user_email);
}
