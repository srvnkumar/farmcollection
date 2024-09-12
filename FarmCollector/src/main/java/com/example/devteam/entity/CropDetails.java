package com.example.devteam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CropDetails {
	
	String farmName;
	
	@Id
	String corpId;
	
	boolean harvested;
	
	
	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	int plantingArea;
	
	String cropName;
	
	int expectedInTons;
	
	int actualInTons;
	
	String season;

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	public int getPlantingArea() {
		return plantingArea;
	}

	public void setPlantingArea(int plantingArea) {
		this.plantingArea = plantingArea;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public int getExpectedInTons() {
		return expectedInTons;
	}

	public void setExpectedInTons(int expectedInTons) {
		harvested = true;
		this.expectedInTons = expectedInTons;
	}

	public int getActualInTons() {
		return actualInTons;
	}

	public void setActualInTons(int actualInTons) {
		this.actualInTons = actualInTons;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	

}
