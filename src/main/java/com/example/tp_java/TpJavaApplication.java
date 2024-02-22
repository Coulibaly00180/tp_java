package com.example.tp_java;

import com.example.tp_java.entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TpJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TpJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 1; i <= 3; i++) {
			PetStore petStore = new PetStore();
			petStore.setName("My Pet Store " + i);
			petStore.setManagerName("Manager " + i);

			Address address = new Address();
			address.setNumber("123" + i);
			address.setStreet("Street " + i);
			address.setZipCode("Zip" + i);
			address.setCity("City " + i);

			petStore.setAddress(address);

			Cat cat = new Cat();
			cat.setBirth(new Date());
			cat.setCouleur(i % 2 == 0 ? "Noir" : "Blanc");

			Fish fish = new Fish();
			fish.setBirth(new Date());
			fish.setCouleur(i % 2 == 0 ? "Rouge" : "Bleu");

			Product product = new Product();
			product.setCode("Code" + i);
			product.setLabel("Label" + i);
			product.setPrice(100.0 * i);

		}
	}

}
