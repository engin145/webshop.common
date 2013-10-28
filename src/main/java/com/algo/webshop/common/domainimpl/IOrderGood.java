package com.algo.webshop.common.domainimpl;

import java.util.List;

import com.algo.webshop.common.domain.GoodsList;
import com.algo.webshop.common.domain.Position;

public interface IOrderGood {
	public void addGoodList(GoodsList goods, int numberOfOrder);

	public List<Position> getGoodList(int orderId);
}
