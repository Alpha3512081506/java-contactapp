package com.api.contactapp.contactapp;

import com.api.contactapp.contactapp.dao.AddressRepository;
import com.api.contactapp.contactapp.dao.UserRepository;
import com.api.contactapp.contactapp.entities.Address;
import com.api.contactapp.contactapp.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class ContactappApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AddressRepository addressRepository ;

	public static void main(String[] args) {
		SpringApplication.run(ContactappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Alpha","Aliou","Mamadou","SAliou","Aissatou","saidou").forEach(name->{
			User user= new User();
			user.setName(name);
			for (int i = 1; i < user.getName().length();  i++) {
				user.setFirstName("firstname"+i);
				user.setAge(19+(int)(Math.random()*45));
				user.setPhoto("https://randomuser.me/api/portraits/men/"+i+".jpg");
				userRepository.save(user);
				userRepository.findAll().forEach(user1 ->{
					for (int j = 1; j < 4; j++) {
						Address address = new Address();
						address.setEmail("email"+j);
						address.setProvince("Province"+j);
						address.setTelephone("telephone"+j);
						address.setVia("via"+j);
						address.setVille("ville"+j);
						address.setUser(user1);
						addressRepository.save(address);

					}
				} );

			}



		});

	}
}
