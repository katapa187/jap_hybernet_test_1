package com.example.accessingdatarest;


import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataRestApplication {

	public static void main(String[] args) throws SQLException,Exception {
		SpringApplication.run(AccessingDataRestApplication.class, args);
	}
}
