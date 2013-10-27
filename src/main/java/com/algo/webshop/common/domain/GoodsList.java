package com.algo.webshop.common.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class GoodsList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5817174500810710386L;
	private Set<Position> positions;

	public GoodsList() {
		positions = new HashSet<Position>();
	}

	public void addPosition(Position positon) {
		positions.add(positon);
	}

	public void addPositions(Set<Position> positons) {
		positions.addAll(positons);
	}

	public Set<Position> getListPosition() {
		return positions;
	}

	public void clearPosition(Position positon) {
		positions.clear();
	}

	public Set<Position> getPositions() {
		return positions;
	}

	public void setPositions(Set<Position> positions) {
		this.positions = positions;
	}
}
