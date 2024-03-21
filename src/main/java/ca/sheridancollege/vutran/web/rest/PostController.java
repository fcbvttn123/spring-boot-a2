package ca.sheridancollege.vutran.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.services.PostService;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
	
	@Autowired 
	private PostService ps;
	
	@GetMapping(value = {"", "/"})
	public List<Post> getAllPosts() {
		return ps.findAll();
	}
	
	@PostMapping(value = {"", "/"})
	public Post insertPost(@RequestBody Post p) {
		return ps.save(p);
	}

}

/*
[
 {
     "id": 1,
     "author": "John Doe",
     "topic": "Java Programming",
     "content": "Introduction to Java programming language",
     "datePosted": "2023-08-10"
 }, 
 {
     "id": 2,
     "author": "Jane Smith",
     "topic": "Spring Boot",
     "content": "Getting started with Spring Boot framework",
     "datePosted": "2023-10-20"
 }, 
 {
     "id": 3,
     "author": "Alice Johnson",
     "topic": "Database Management",
     "content": "An overview of relational database management systems",
     "datePosted": "2024-01-15"
 }
]
*/




// Boostrap Data
// H2 DB
