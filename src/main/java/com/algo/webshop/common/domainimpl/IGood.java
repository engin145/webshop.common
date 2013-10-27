package com.algo.webshop.common.domainimpl;

import java.util.List;

import com.algo.webshop.common.domain.Good;
import com.algo.webshop.common.domain.GoodsList;

public interface IGood {

	public Good getGood(int id);

	public List<Good> getGoods(int category_id);

	public List<Good> getGoodsSelect(int category_id, int manufacturer_id,
			int min, int max);

	public int addGood(Good good);

	public void updateGood(Good good);
<<<<<<< HEAD
	
	public void updateGoodName(int id, String name);
	
	public void updateGoodCategory(int id, int categoryId);
	
	public void updateGoodManufacturer(int id, int manufacturerId);
	
	public void updateGoodAmount(int id, float amount);
	
	public float updateGoodAmountSum(int id, float amount);
	
	public void updateGoodUnit(int id, int unitId);
	
	public void updateGoodDescription(int id, String desc);
	
=======

>>>>>>> c74b0cef30c6c492a88a8f7d4936283fb91054af
	public int removeGood(int id);

	public String getLongDescription(int good_id);

	public void setLongDescription(int goods_id, String longDescription);

	public String getManufactur(int good_id);

	public void updateAmount(GoodsList goodList);

}
