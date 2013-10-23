package com.algo.webshop.common.domainimpl;

import java.util.List;

import com.algo.webshop.common.domain.Good;

public interface IGood {

	public Good getGood(int id);

	public List<Good> getGoods(int category_id);
	
	public List<Good> getGoodsSelect(int category_id, int manufacturer_id, int min, int max);
	
	public int addGood(Good good);

	public void updateGood(Good good);
	
	public int removeGood(int id);
	
	public String getLongDescription(int good_id);
	
	public void setLongDescription(int goods_id, String longDescription);

	public String getManufactur(int good_id);
}
