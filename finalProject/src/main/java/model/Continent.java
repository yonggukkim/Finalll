package model;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Continent implements Serializable{
	private String continentName; // 대륙이름

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
}
