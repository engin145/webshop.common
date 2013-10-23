package com.algo.webshop.common.domainimpl;

import java.util.List;
import java.util.Map;

import com.algo.webshop.common.domain.Unit;


public interface IUnit {
	public Unit getUnit(int id);

	public List<Unit> getUnits();

	// returns an id that generated the database
	public int addUnit(Unit unit);

	public void updateUnit(Unit unit);
	
	public void delUnit(int id);
	
	public Map<String, Object> getMapCategory();
}
