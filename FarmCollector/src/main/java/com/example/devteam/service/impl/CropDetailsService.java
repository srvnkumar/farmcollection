package com.example.devteam.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devteam.entity.CropDetails;
import com.example.devteam.repository.CropRepository;
import com.example.devteam.service.ICropDetailsService;

@Service
public class CropDetailsService implements ICropDetailsService {
	
	@Autowired
	CropRepository repo;

	@Override
	@Transactional
	public void saveCropDetails(CropDetails details) {
		repo.save(details);
		
	}

	@Override
	public CropDetails getCropDetails(String cropId) {

		return repo.getById(cropId);
	}

	@Override
	@Transactional
	public CropDetails updateCropDetails(CropDetails details) {
		// TODO Auto-generated method stub
		CropDetails detailsUpdated = repo.getById(details.getCorpId());
		if(detailsUpdated!=null) {
			 detailsUpdated.setActualInTons(details.getActualInTons());
			 detailsUpdated = repo.save(detailsUpdated);
			 
		}
		
		return detailsUpdated;
	}



}
