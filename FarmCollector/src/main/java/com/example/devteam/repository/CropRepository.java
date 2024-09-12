package com.example.devteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.devteam.entity.CropDetails;

@Repository
public interface CropRepository extends JpaRepository<CropDetails, String>{
	

}
