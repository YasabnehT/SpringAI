package com.FCC.SpringAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiApplication.class, args);
	}
	@Bean
	public CommandLineRunner renner(ChatClient.Builder builder){
		return args -> {
			ChatClient chatClient = builder.build();
			String response = chatClient.prompt("Tell me a joke").call().content();
			System.out.println(response);
		}
	}
}
