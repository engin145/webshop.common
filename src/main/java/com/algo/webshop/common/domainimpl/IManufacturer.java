package com.algo.webshop.common.domainimpl;

import java.util.List;
import java.util.Map;

import com.algo.webshop.common.domain.Manufacturer;

public interface IManufacturer {

	public Manufacturer getManufacturer(int id);

	public List<Manufacturer> getManufacturers();

	// returns an id that generated the database
	public int addManufacturer(Manufacturer manufacturer);

	public void updateManufacturer(Manufacturer manufacturer);

	public void delManufacturer(int id);
	
	public Map<String, Object> getMapManufacturer();

}
