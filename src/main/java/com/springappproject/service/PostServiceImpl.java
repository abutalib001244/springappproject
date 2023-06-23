package com.springappproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springappproject.entity.Post;
import com.springappproject.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;

	@Override
	public String upsert(Post post) {
		postRepository.save(post);
		return "Record save successfully";
	}

	@Override
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	@Override
	public Post getPostById(long id) {
		Optional<Post> findById = postRepository.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}else {
			return null;
		}
	}

	@Override
	public String deletePostById(long id) {
		if(postRepository.existsById(id)) {
			postRepository.deleteById(id);
			return "Record delete successfully";
		}else {
			return "Record not found with id:"+id;
		}
	}
	
}
