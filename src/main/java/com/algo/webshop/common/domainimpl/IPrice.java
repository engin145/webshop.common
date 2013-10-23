package com.algo.webshop.common.domainimpl;

import java.sql.Date;
import java.util.List;

import com.algo.webshop.common.domain.Price;

public interface IPrice {

	public int addPrice(Price price); 
	public List<Price> getAllPrice();
	public List<Price> getMaxDateAllPrice();
	public Price getMaxDatePriceByOneGood(int goodId);
	public List<Price> getMaxDatePriceByOneCategory(int categoryId);
	public List<Price> getActualDataAllPrice(Date date);
	public Price getActualDatePrice(Date date);
}
