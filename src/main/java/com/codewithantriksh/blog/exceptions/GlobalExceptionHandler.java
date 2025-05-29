package com.codewithantriksh.blog.exceptions;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
=======
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.codewithantriksh.blog.payloads.ApiResponse;

@ControllerAdvice // ✅ Use this instead of @RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex) {
        String message = ex.getMessage();
        ApiResponse apiResponse = new ApiResponse(message, false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
<<<<<<< HEAD
        
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex)
    {
    	Map<String, String> resp=new HashMap<>();
    	ex.getBindingResult().getAllErrors().forEach((error)->{
    		String filedName = ((FieldError)error).getField();
    		String message = error.getDefaultMessage();
    		resp.put(filedName, message);
    	});
    	return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
    	
    }


=======
    }
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
}
