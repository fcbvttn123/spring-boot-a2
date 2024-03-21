package ca.sheridancollege.vutran.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.vutran.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	public List<Post> findByTopic(String topic);
	public List<Post> findAllByOrderByDatePostedDesc();
	public List<Post> findAllByOrderByTimePostedDesc();
}
