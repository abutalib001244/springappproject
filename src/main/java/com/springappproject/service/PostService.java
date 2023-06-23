package com.springappproject.service;

import java.util.List;

import com.springappproject.entity.Post;

public interface PostService {

    public String upsert(Post post);

    public List<Post> getAllPosts();

	public Post getPostById(long id);

	public String deletePostById(long id);
	
	

}
