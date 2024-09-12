package com.example.devteam.DTO;

public class CropDetailsDTO {
	
	int area;
	
	String cropType;
	
	int amountInTons;
	
	boolean harvested;
	
	int expectedInTons;

	public int getExpectedInTons() {
		return expectedInTons;
	}

	public void setExpectedInTons(int expectedInTons) {
		this.expectedInTons = expectedInTons;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public int getAmountInTons() {
		return amountInTons;
	}

	public void setAmountInTons(int amountInTons) {
		this.amountInTons = amountInTons;
	}
	
	

}
