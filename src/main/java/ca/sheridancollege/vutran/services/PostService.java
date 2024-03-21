package ca.sheridancollege.vutran.services;

import java.util.List;
import java.util.Optional;

import ca.sheridancollege.vutran.domain.Post;

public interface PostService {
	public List<Post> findAll();
	public List<Post> findAllByOrderByDatePostedDesc();
	public Post findById(Long id);
	public List<Post> findByTopic(String topic);
	public Post save(Post post);
}
