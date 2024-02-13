package com.aj.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

	private Integer commentId;
	
	private String content;

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
//	public CommentDto() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public CommentDto(Integer commentId, String content) {
//		super();
//		this.commentId = commentId;
//		this.content = content;
//	}
//	
}
