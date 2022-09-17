package com.nodion.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@SpringBootApplication
@Controller
public class DemoApplication {

	@RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello Nodion!";
  }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
