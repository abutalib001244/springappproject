package com.springappproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springappproject.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
