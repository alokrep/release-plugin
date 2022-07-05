package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.tutorial.protos.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Person john = Person.newBuilder()
    				.setId(1234)
    				.setName("John Doe")
    				.setEmail("jdoe@example.com")
    				.addPhones(
      					Person.PhoneNumber.newBuilder()
        			.setNumber("555-4321")
        			.setType(Person.PhoneType.HOME))
    				.build();
    	AddressBook.Builder addressBook = AddressBook.newBuilder();
			
	}

}
