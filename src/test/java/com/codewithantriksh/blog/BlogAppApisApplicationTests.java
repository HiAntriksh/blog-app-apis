package com.codewithantriksh.blog;

import org.junit.jupiter.api.Test;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogAppApisApplicationTests {

=======
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithantriksh.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	@Autowired
	private UserRepo userRepo;
	
<<<<<<< HEAD
=======
>>>>>>> 6922f9c (commit)
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
	@Test
	void contextLoads() {
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
}
=======
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
    @Test
	public void repoTest()
	{
	 String className = this.userRepo.getClass().getName();
	 String packName = this.userRepo.getClass().getPackageName();
	 System.out.println(className);
	 System.out.println(packName);
	}
	


<<<<<<< HEAD
}
=======
}
>>>>>>> 6922f9c (commit)
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
