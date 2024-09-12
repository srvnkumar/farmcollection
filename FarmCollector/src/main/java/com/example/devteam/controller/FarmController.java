package com.example.devteam.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.devteam.DTO.CropDetailsDTO;
import com.example.devteam.DTO.HarvestDetailsDTO;
import com.example.devteam.Response.CropDetailsResponse;
import com.example.devteam.entity.CropDetails;
import com.example.devteam.service.ICropDetailsService;

@RestController
public class FarmController {
	
	@Autowired
	ICropDetailsService service;
	
	@PostMapping("/farmname/{farmName}/seasonname/{seasonName}")
	public CropDetailsResponse providePlantedCorpDetails(@PathVariable String farmName,
								@PathVariable String seasonName, @RequestBody CropDetailsDTO cropDetails){
		
		//error handling if there is other than corn or onion
		CropDetails details = getCropDetails(cropDetails, farmName, seasonName);
		service.saveCropDetails(details);
		
		return new CropDetailsResponse(details);
		
	}
	

	private CropDetails getCropDetails(CropDetailsDTO cropDetails, String framName, String seasonName) {
		
		CropDetails details = new CropDetails();
		details.setFarmName(framName);
		details.setSeason(seasonName);
		details.setPlantingArea(cropDetails.getArea());
		details.setExpectedInTons(cropDetails.getAmountInTons());
		details.setCropName(cropDetails.getCropType());
		details.setCorpId(UUID.randomUUID().toString());
		return details;
	}
	

	@PutMapping("/cropdetails/{id}")
	public CropDetails updateHarvestDetails(@PathVariable String id,@RequestBody HarvestDetailsDTO dto){
		CropDetails cropDetails = service.getCropDetails(id);
		cropDetails.setActualInTons(dto.getAmountHarvested());
		return service.updateCropDetails(cropDetails);

	}

}
