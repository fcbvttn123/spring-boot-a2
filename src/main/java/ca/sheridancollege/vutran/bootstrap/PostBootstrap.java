package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;
import java.time.LocalTime;

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
		
		Post post = new Post((long)1, "David", "First Topic", "Topic's Content", LocalDate.now(), LocalTime.now());
		ps.save(post);
		
	}
}
