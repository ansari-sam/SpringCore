package com.springboot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.dao.UserRepository;
import com.springboot.entities.User;

@SpringBootApplication
public class SpringbootcoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootcoreApplication.class, args);
		
		UserRepository userRepo = context.getBean(UserRepository.class);
//		User user=new User();
//		user.setUserName("Deepak");
//		user.setUserCity("Noida");
//		user.setUserStatus("Professor");
//		
//		User user1=new User();
//		user1.setUserName("Bora");
//		user1.setUserCity("Noida");
//		user1.setUserStatus("Recruiter");
//		
//		User user1 = userRepo.save(user);
//		System.out.println(user1);
//		List<User> users=new ArrayList<User>();
//		users.add(user);
//		users.add(user1);
//		Iterable<User> result = userRepo.saveAll(users);
//		result.forEach(User->{
//			System.out.println(User);
//		});
		
//		Update Data
		
//		Optional<User> optional = userRepo.findById(4);
//		User user = optional.get();
//		user.setUserName("Deepak Shukla");
//		User user2 = userRepo.save(user);
//		System.out.println(user2);
		
//		get Data from DB
//		userRepo.findById(id);
//		Iterable<User> iterable = userRepo.findAll();
//		Iterator<User> iterator = iterable.iterator();
//		while(iterator.hasNext()) {
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
//		iterable.forEach(user->{
//			System.out.println(user);
//		});
		
//		delete user
//		
//		userRepo.deleteById(3);
//		System.out.println("Deleted");
		
		
		//Custom or Derived finder
//		List<User> name = userRepo.findByUserName("Deepak Shukla");
//		name.forEach(e->System.out.println(e));
//		List<User> userIdBetween = userRepo.findByUserIdBetween(2, 5);
//		userIdBetween.forEach(e->System.out.println(e));
		
//		List<User> city = userRepo.findByUserCity("Noida");
//		city.forEach(e->System.out.println(e));
		
//		List<User> name = userRepo.findByUserNameLike("Deepak%");
//		name.forEach(e->System.out.println(e));
		
//		List<User> status = userRepo.findByUserStatusStartingWith("Rec");
//		status.forEach(s->System.out.println(s));
		
//		List<User> user = userRepo.findByUserNameAndUserCity("Sam", "Noida");
//		user.forEach(u->System.out.println(u));
		
//		List<User> users = userRepo.getAllUser();
//		users.forEach(u->System.out.println(u));
		
//		List<User> name = userRepo.getUserByName("Bora");
//		name.forEach(n->System.out.println(n));
		
//		List<User> user = userRepo.getUserByNameAndCity("Sam", "Noida");
//		user.forEach(u->System.out.println(u));
		
		List<User> users = userRepo.getUsers();
		users.forEach(u->System.out.println(u));
	}

}
