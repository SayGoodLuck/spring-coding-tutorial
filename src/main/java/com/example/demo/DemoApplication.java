package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	// этот сервис будет служить для бронирования билетов в самолете
	// можно забронировать n количество билетов
	// можно отменить бронь
	// график прибытия - отправления
	// конечные пункты

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}