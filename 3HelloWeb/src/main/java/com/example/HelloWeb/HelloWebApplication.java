package com.example.HelloWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloWebApplication.class, args);
	}

	@RequestMapping(value="/",method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> hello(){
		return new ResponseEntity<Object>("Hello web", HttpStatus.OK);
	}

	@RequestMapping(value="/app",method = RequestMethod.GET, produces="text/html")
	public String app(){
		return "<html><body><h1 style='color:red;font-size:19em;' onmousemove='fun()'>Hello" +
				"</h1><p>hello</p><script>function fun(){alert('hello');}</script></body></html>";
	}

}
