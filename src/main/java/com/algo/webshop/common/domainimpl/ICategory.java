package com.algo.webshop.common.domainimpl;

import java.util.List;
import java.util.Map;

import com.algo.webshop.common.domain.Category;

public interface ICategory {

	public Category getCategory(int id);

	public List<Category> getCategorys();

	// returns an id that generated the database
	public int addCategory(Category category);

	public void updateCategory(Category category);
	
	public void delCategory(int id);
	
	public Map<String, Object> getMapCategory();
}
