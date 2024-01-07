package com.example.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootTest(classes = SpringSecurityApplicationTests.TestConfig.class)
class SpringSecurityApplicationTests {

	@Test
	void contextLoads() {
		// Check if the application context loads successfully
	}

	@Configuration
	@EnableWebSecurity
	static class TestConfig {

		@Bean
		public UserDetailsService userDetailsService() {
			UserDetails user = User.builder()
					.username("testUser")
					.password(passwordEncoder().encode("testPassword"))
					.roles("USER")
					.build();
			return new InMemoryUserDetailsManager(user);
		}

		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
	}
}