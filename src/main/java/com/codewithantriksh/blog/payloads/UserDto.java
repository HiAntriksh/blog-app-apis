package com.codewithantriksh.blog.payloads;

<<<<<<< HEAD
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
=======
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	
	
	private int id;
	
<<<<<<< HEAD
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 charaters")
	private String name;

	@Email (message = "Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10, message = "Password must be min of 3 char and max of 10 chars !!")
	private String password;
	
	@NotEmpty
=======
	private String name;
	
	private String email;
	
	private String password;
	
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
	private String about;
	
	
	
	
}
