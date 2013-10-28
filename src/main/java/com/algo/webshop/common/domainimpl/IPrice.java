package com.algo.webshop.common.domainimpl;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import com.algo.webshop.common.domain.Price;

public interface IPrice {

	public float addPrice(Price price);

	public float addPriceSum(Price price);

	public List<Price> getAllPrice();

	public List<Price> getMaxDateAllPrice();

	public Price getMaxDatePriceByOneGood(int goodId);

	public List<Price> getMaxDatePriceByOneCategory(int categoryId);

	public List<Price> getActualDataAllPrice(Date date);

	public Price getActualDatePrice(Calendar date, int good_id);
}
