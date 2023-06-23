package com.springappproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springappproject.entity.Post;
import com.springappproject.service.PostService;

@RestController
@RequestMapping("api/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@PostMapping
	public ResponseEntity<String> upsert(@RequestBody Post post){
		String status = postService.upsert(post);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<String> updatePost(@RequestBody Post post){
		String status = postService.upsert(post);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Post>> getAllPosts(){
		 List<Post> allPosts = postService.getAllPosts();
		 return new ResponseEntity<>(allPosts, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable("id") long id){
		Post post = postService.getPostById(id);
		return new ResponseEntity<>(post, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePostById(@PathVariable("id") long id){
		String status = postService.deletePostById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
