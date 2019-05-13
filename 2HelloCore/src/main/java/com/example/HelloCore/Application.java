package com.example.HelloCore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		System.out.println("Hello Word");
	}


	/*public static*/ class Demo implements CommandLineRunner{


		@Override
		public void run(String... args) throws Exception {
			System.out.println("Demo=>1");
		}

		@Bean
		public CommandLineRunner fun(){
			return args -> {
				System.out.println("Demo=>2");
			};
		}

	}

	/*@Bean
	public Demo hello(){
		return new Demo();
	}*/


}
