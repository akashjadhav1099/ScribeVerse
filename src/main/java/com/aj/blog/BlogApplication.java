package com.aj.blog;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.aj.blog.config.AppConstants;
import com.aj.blog.entities.Role;
import com.aj.blog.repositories.RoleRepository;

@SpringBootApplication
public class BlogApplication implements CommandLineRunner{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.passwordEncoder.encode("jayesh123"));
		
		try {
			Role normalRole= new Role();
			normalRole.setId(AppConstants.NORMAL_USER);
			normalRole.setName("NORMAL_USER");
			
			Role adminRole= new Role();
			adminRole.setId(AppConstants.ADMIN_USER);
			adminRole.setName("ADMIN_USER");
			
			List<Role> roles = List.of(normalRole, adminRole);
			
			List<Role> result = this.roleRepository.saveAll(roles);
			
			result.forEach(r->{
				System.out.println(r.getName());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
