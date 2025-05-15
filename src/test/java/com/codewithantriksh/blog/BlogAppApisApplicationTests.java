package com.codewithantriksh.blog;

import org.junit.jupiter.api.Test;
<<<<<<< HEAD
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogAppApisApplicationTests {

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithantriksh.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	@Autowired
	private UserRepo userRepo;
	
>>>>>>> 6922f9c (commit)
	@Test
	void contextLoads() {
	}

<<<<<<< HEAD
}
=======
    @Test
	public void repoTest()
	{
	 String className = this.userRepo.getClass().getName();
	 String packName = this.userRepo.getClass().getPackageName();
	 System.out.println(className);
	 System.out.println(packName);
	}
	


}
>>>>>>> 6922f9c (commit)
