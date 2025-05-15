package com.codewithantriksh.blog;

<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
>>>>>>> 6922f9c (commit)

@SpringBootApplication
public class BlogAppApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

<<<<<<< HEAD
}
=======
	@Bean
	public ModelMapper modelMapper() {
	return  new ModelMapper();
	
}

}
>>>>>>> 6922f9c (commit)
