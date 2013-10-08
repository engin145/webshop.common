package com.algo.webshop.common.domainimpl;

import java.util.List;

import com.algo.webshop.common.domain.Good;

public interface IGood {

	public Good getGood(int id);

	public List<Good> getGoods(int category_id);

	public void addGood(Good good);

	public void updateGood(Good good);
	
	public void removeGood(int id);
	
	public String getLongDescription(int good_id);

	public String getManufactur(int good_id);
}
