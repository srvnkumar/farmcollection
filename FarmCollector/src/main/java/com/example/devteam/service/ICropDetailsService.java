package com.example.devteam.service;

import org.springframework.stereotype.Service;

import com.example.devteam.entity.CropDetails;

@Service
public interface ICropDetailsService {
	
	public void saveCropDetails(CropDetails details);
	
	public CropDetails getCropDetails(String cropId);
	
	public CropDetails updateCropDetails(CropDetails details);

}
