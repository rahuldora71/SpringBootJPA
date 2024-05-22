package com.springboot.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
	    ApplicationContext context=	SpringApplication.run(SpringBootJpaApplication.class, args);
	    UserRepository userRepository=context.getBean(UserRepository.class);
	    // insert Data 
	    
	    
//	    User user=new User();
//	    user.setName("Bharti");
//	    user.setCity("Rampur");
//	    user.setStatus("I am Database operator");
//	    
//	    
//	    User user2=new User();
//	    user2.setName("Suraj");
//	    user2.setCity("Sharanput");
//	    user2.setStatus("I am API  Developer");
//	    
//	    
//	    
//	    
//	    User user3=new User();
//	    user3.setName("Sahil");
//	    user3.setCity("Panipat");
//	    user3.setStatus("I am Back-end Developer");
//	    
//	    
//	    //for saving only one user 
//	    
//	    
////	    User userSaved=userRepository.save(user);
////	    System.out.println(userSaved);
//	    
//	    
//	    // for saving more no. of users
//	    	    
//	    List<User> users=List.of(user,user2,user3);
//	    Iterable<User> result = userRepository.saveAll(users);
//	    result.forEach(userResult->{
//	    	System.out.println(userResult);
//	    });
	    

	    //Update Data
	    
////	    Optional<User> optional = userRepository.findById(252);
////	    User userUpdate = optional.get(); // it will throw exception if it can,t find data of that particular id
////	    userUpdate.setName("Anshika");
////	    User saveResult = userRepository.save(userUpdate);
////	    System.out.println(saveResult);
//	    
//	    
//	    //How to get The Data From Database
//	    //by the use of findbyid(id) method - return Optional Containing your Data 
//	    //
//	    Iterable<User> itr = userRepository.findAll();
//	    //old method
////	    Iterator<User> iterator = itr.iterator();
////	    while (iterator.hasNext()) {
////			User userfetch = (User) iterator.next();
////			System.out.println(userfetch);
////		}
//	    
//	    //new method for 
//	    itr.forEach(userOut->{
//	    	System.out.println(userOut);
//	    });
//	    
	    
	    //Deleting the user element
//	    userRepository.deleteById(102);
//	    System.out.println("Deleted");
	    
	    
	    List<User> byName = userRepository.findByName("Rahul Dora ");
	    byName.forEach(e->System.out.println(e));
System.out.println("========================================================================================================");
	    List<User> byNameandCity = userRepository.findByNameAndCity("Rahul Dora ","Karnal");
	    byNameandCity.forEach(e->System.out.println(e));
	    
	    
	    
	    
	 }

}
