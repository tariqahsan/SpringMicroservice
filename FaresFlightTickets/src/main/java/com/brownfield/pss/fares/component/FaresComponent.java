package com.brownfield.pss.fares.component;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brownfield.pss.fares.entity.Fare;
import com.brownfield.pss.fares.repository.FaresRepository;

@Service 
public class FaresComponent {
	private static final Logger logger = LoggerFactory.getLogger(FaresComponent.class);

	FaresRepository faresRepository;
	
	public FaresComponent(){
		
	}
	@Autowired
	public FaresComponent(FaresRepository faresRepository){
		this.faresRepository = faresRepository;
	}

	public Fare getFare(String flightNumber, String flightDate){ 
		logger.info("Looking for fares flightNumber "+ flightNumber + " flightDate "+ flightDate);
		return faresRepository.getFareByFlightNumberAndFlightDate(flightNumber, flightDate);
	}
	
	public List<Fare> getAllFare(){ 
		logger.info("Looking for All fares ");
		return faresRepository.findAll();
	}
}





