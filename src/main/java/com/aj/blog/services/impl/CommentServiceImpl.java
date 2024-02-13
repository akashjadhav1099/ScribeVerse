package com.aj.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aj.blog.entities.Comment;
import com.aj.blog.entities.Post;
import com.aj.blog.exceptions.ResourceNotFoundException;
import com.aj.blog.payloads.CommentDto;
import com.aj.blog.repositories.CommentRepository;
import com.aj.blog.repositories.PostRepository;
import com.aj.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post= this.postRepository.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", "Post Id", postId));
	
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
	    comment.setPost(post);
	    
		Comment savedComment= this.commentRepository.save(comment);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comment= this.commentRepository.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", "Comment ID", commentId));
		this.commentRepository.delete(comment);
	}

}
