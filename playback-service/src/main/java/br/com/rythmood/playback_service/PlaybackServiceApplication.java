package br.com.rythmood.playback_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PlaybackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaybackServiceApplication.class, args);
	}

}
