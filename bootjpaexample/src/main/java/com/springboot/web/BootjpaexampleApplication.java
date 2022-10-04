package com.springboot.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
// save the user data....

		// User user = new User();
		// user.setName("Shyam Verma");
		// user.setCity("Delhi");
		// user.setStatus("I am C++ programmer");
		// User user1 = userRepository.save(user);
		// System.out.println(user1);

		// update the user of id 6
		// Optional<User> optional = userRepository.findById(6);
		// User user3 = optional.get();
		// user3.setName("Chandan Bhayal");
		// User result = userRepository.save(user3);
		// System.out.println(result);

		// How to get the data
//findByid(id)-return Optional Containing your data
		// Iterable<User> itr = userRepository.findAll();
		// Iterator<User> iterator = itr.iterator();
		// while (iterator.hasNext()) {
		// User user = iterator.next();
		// System.out.println(user);

		// }

		// Delete The User Element
		// userRepository.deleteById(6);
		// System.err.println("Deleting the data of user id 6");
		// Iterable<User> allusers = userRepository.findAll();
		// allusers.forEach(user -> {

		// System.out.println(user);
		// userRepository.deleteAll(allusers);
		// });

		 List<User> users = userRepository.findByNameAndCity("Ankit", "Bhopal");
		//List<User> users = userRepository.findByName("Shyam Verma");
		users.forEach(e -> System.out.println(e));
	}
}