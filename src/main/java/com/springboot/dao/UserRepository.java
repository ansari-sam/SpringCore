package com.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByUserName(String name);
	public List<User> findByUserNameAndUserCity(String name,String city);
	public List<User> findByUserNameLike(String name);
	public List<User> findByUserCity(String city);
	public List<User> findByUserStatus(String stattus);
	public List<User> findByUserIdBetween(Integer id1,Integer id2);
	public List<User> findByUserStatusStartingWith(String status);
	
//	JPQL-Java Persistence Query Language, Same as HQL
	@Query("from User")
	public List<User> getAllUser();
	
	@Query("from User where userName=:n")
	public List<User> getUserByName(@Param("n") String name);
	
	@Query("from User where userName=:n and userCity=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name,@Param("c") String city);
	
	//Native Query--MySQL
	@Query(value = "select * from User", nativeQuery = true)
	public List<User> getUsers();
	
	
}
