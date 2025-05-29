package com.codewithantriksh.blog.entities;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
=======
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int    id;
	
	
	
	@Column(name = "user_name", nullable = false , length = 100)
	private String name;
	
	
	
	
	private String email;
	
	
	
	private String password;
	
	
	
	private String about;
<<<<<<< HEAD

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Post> posts = new ArrayList<>();

=======
>>>>>>> b5765cf392e12a19c21e642106696e2585c13d56
	
	
	

}
