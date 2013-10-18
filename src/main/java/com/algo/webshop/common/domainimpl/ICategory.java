package com.algo.webshop.common.domainimpl;

import java.util.List;

import com.algo.webshop.common.domain.Category;

public interface ICategory {

	public Category getCategory(int id);

	public List<Category> getCategorys();

	public int addCategory(Category category);

	public void updateCategory(Category category);
	
	public void delCategory(int id);
}
