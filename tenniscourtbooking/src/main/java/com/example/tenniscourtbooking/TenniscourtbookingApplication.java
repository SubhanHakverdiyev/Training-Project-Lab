package com.example.tenniscourtbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TenniscourtbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TenniscourtbookingApplication.class, args);
	}
// starting database server : pg_ctl -D /usr/local/var/postgresql@14 start
}
