package br.com.dio.desafio_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringApplication.class, args);
	}

}
