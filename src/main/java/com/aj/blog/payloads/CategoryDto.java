package com.aj.blog.payloads;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CategoryDto {

	private Integer categoryId;
	
	@NotEmpty
	private String categoryTitle;
	
	@NotEmpty
	private String categoryDescription;

//	public Integer getCategoryId() {
//		return categoryId;
//	}
//
//	public void setCategoryId(Integer categoryId) {
//		this.categoryId = categoryId;
//	}
//
//	public String getCategoryTitle() {
//		return categoryTitle;
//	}
//
//	public void setCategoryTitle(String categoryTitle) {
//		this.categoryTitle = categoryTitle;
//	}
//
//	public String getCategoryDescription() {
//		return categoryDescription;
//	}
//
//	public void setCategoryDescription(String categoryDescription) {
//		this.categoryDescription = categoryDescription;
//	}
//
//	public CategoryDto(Integer categoryId, String categoryTitle, String categoryDescription) {
//		super();
//		this.categoryId = categoryId;
//		this.categoryTitle = categoryTitle;
//		this.categoryDescription = categoryDescription;
//	}
//
//	public CategoryDto() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	
	
}
