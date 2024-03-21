package ca.sheridancollege.vutran.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.domain.Post;
import ca.sheridancollege.vutran.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired 
	private PostRepository pr;

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public List<Post> findAllByOrderByDatePostedDesc() {
		// TODO Auto-generated method stub
		return pr.findAllByOrderByDatePostedDesc();
	}

	@Override
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public List<Post> findByTopic(String topic) {
		// TODO Auto-generated method stub
		return pr.findByTopic(topic);
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		post.setDatePosted(LocalDate.now());
		post.setTimePosted(LocalTime.now());
		return pr.save(post);
	}

	@Override
	public List<Post> findAllByOrderByTimePostedDesc() {
		// TODO Auto-generated method stub
		return pr.findAllByOrderByTimePostedDesc();
	}

}
