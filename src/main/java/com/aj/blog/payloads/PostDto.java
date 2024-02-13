package com.aj.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

	private Integer postId;
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	private Set<CommentDto> comments = new HashSet<>();

//	public Integer getPostId() {
//		return postId;
//	}
//	public void setPostId(Integer postId) {
//		this.postId = postId;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public String getImageName() {
//		return imageName;
//	}
//	public void setImageName(String imageName) {
//		this.imageName = imageName;
//	}
//	public Date getAddedDate() {
//		return addedDate;
//	}
//	public void setAddedDate(Date addedDate) {
//		this.addedDate = addedDate;
//	}
//	public Category getCategory() {
//		return category;
//	}
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public PostDto(Integer postId, String title, String content, String imageName, Date addedDate, Category category,
//			User user) {
//		super();
//		this.postId = postId;
//		this.title = title;
//		this.content = content;
//		this.imageName = imageName;
//		this.addedDate = addedDate;
//		this.category = category;
//		this.user = user;
//	}
//	public PostDto() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Set<CommentDto> getComments() {
//		return comments;
//	}
//	public void setComments(Set<CommentDto> comments) {
//		this.comments = comments;
//	}

}
