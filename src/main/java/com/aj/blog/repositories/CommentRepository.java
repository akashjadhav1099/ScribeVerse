package com.aj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj.blog.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
