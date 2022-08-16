package com.example.spring.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	// LDAP or Database
	// In memory
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails = createNewUser(passwordEncoder, "in28minutes", "dummy");
		UserDetails tin1 = createNewUser(passwordEncoder, "tin1", "dummy");
		UserDetails tin2 = createNewUser(passwordEncoder, "tin2", "dummy");
		return new InMemoryUserDetailsManager(userDetails, tin1, tin2);
	}

	private UserDetails createNewUser(Function<String, String> passwordEncoder, String username, String password) {
		return User.builder().passwordEncoder(passwordEncoder).username(username).password(password)
				.roles("USER", "ADMIN").build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
