package com.sevenrental.core;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@SpringBootApplication
public class CoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}
//	private static final long timeOutConnect = 30;
//	private static final long timeOutRead = 30;
//	private static final boolean bufferRequestBody = false;
//
//	public static void main(String[] args) {
//		SpringApplication.run(CoreApplication.class, args);
//	}
//
//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplateBuilder()
//				.setConnectTimeout(Duration.ofSeconds(timeOutConnect))
//				.setReadTimeout(Duration.ofSeconds(timeOutRead))
//				.setBufferRequestBody(bufferRequestBody)
//				.build();
//	}
}
