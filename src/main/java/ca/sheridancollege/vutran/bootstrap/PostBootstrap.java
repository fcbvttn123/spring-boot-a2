package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.services.PostService;

@Component
public class PostBootstrap implements CommandLineRunner {
	
	@Autowired 
	private PostService ps;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Post p1 = new Post("David", "David Post", "Post Content 1", LocalDate.of(2019, 3, 27));

	}

}
