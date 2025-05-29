package com.codewithantriksh.blog.controllers;

import java.util.List;
import java.util.Map;
import com.codewithantriksh.blog.services.impl.UserServiceImpl;
<<<<<<< HEAD

import jakarta.validation.Valid;

=======
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithantriksh.blog.payloads.ApiResponse;
import com.codewithantriksh.blog.payloads.UserDto;
import com.codewithantriksh.blog.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServiceImpl userServiceImpl;
	
	@Autowired
	private  UserService userService;

    UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }
	
	//POST - create user
	@PostMapping("/")
<<<<<<< HEAD
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
=======
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
	
	{
		UserDto createUserDto = this.userService.createUer(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
				
		
	}
	
	
	//PUT - update user
	@PutMapping("/{userId}")
<<<<<<< HEAD
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer uid)
=======
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId") Integer uid)
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
	{
		UserDto updateUser = this.userService.updateUser(userDto, uid);
		return ResponseEntity.ok(updateUser);
		
	}
	
	// DELETE - delete user
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable("userId") Integer uid){
    this.userService.deleteUser(uid);
     return new ResponseEntity <ApiResponse>(new ApiResponse("User deleted Successfully",true),HttpStatus.OK);
	}
	
	
	
	//GET - user get
		@GetMapping("/")
		public ResponseEntity<List<UserDto>> getAllUsers(){
			
			return ResponseEntity .ok(this.userService.getAllUser());
					
		}
	
	//GET - user get
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId){
		
		return ResponseEntity .ok(this.userService.getUserById(userId));
				
	}
	

}
<<<<<<< HEAD
=======


// test push change
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
