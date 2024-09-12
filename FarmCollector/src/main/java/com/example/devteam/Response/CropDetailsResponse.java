package com.example.devteam.Response;

import com.example.devteam.entity.CropDetails;

public class CropDetailsResponse{
	
	String cropId;

	public CropDetailsResponse(CropDetails details) {
		this.cropId = details.getCorpId();
	}

	public String getCropId() {
		return cropId;
	}

	public void setCropId(String cropId) {
		this.cropId = cropId;
	}
	

}
