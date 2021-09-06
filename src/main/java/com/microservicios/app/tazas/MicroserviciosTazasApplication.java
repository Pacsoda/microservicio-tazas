package com.microservicios.app.tazas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.microservicios.commons.tazas.models.entity"})
public class MicroserviciosTazasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosTazasApplication.class, args);
	}

}
