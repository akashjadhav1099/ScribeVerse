package com.aj.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	
	private String content;

	@ManyToOne
	@JoinColumn(name="post_id")
	private Post post;
	
	
	
//	public Comment() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Comment(Integer commentId, String content, Post post) {
//		super();
//		this.commentId = commentId;
//		this.content = content;
//		this.post = post;
//	}
//
//	public Integer getCommentId() {
//		return commentId;
//	}
//	
//	public void setCommentId(Integer commentId) {
//		this.commentId = commentId;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	public Post getPost() {
//		return post;
//	}
//
//	public void setPost(Post post) {
//		this.post = post;
//	}

	
}
