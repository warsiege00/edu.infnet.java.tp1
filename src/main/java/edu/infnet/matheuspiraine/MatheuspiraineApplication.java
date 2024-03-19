package edu.infnet.matheuspiraine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class MatheuspiraineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatheuspiraineApplication.class, args);
	}

}
