package com.src.test.category;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SubCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUB_CATEGORY_CODE")
	private String subCategoryCode;
	
	
	@Column(name = "SUB_CATEGORY_NAME")
	private String subCategoryName;

	private String categoryCode;

	public String getSubCategoryCode() {
		return subCategoryCode;
	}

	public void setSubCategoryCode(String subCategoryCode) {
		this.subCategoryCode = subCategoryCode;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	
}
