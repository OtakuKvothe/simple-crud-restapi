package com.swarnendu.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		String sql = "INSERT INTO users(name, id) VALUES('Neo', 1); INSERT INTO users(name, id) VALUES('Owt', 2); INSERT INTO users(name, id) VALUES('Three', 3); COMMIT;";

		int rows = jdbcTemplate.update(sql);
		if(rows > 0){
			System.out.println("Rows successfully inserted");
		}
	}
}
