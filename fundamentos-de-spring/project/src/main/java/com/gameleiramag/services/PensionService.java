package com.gameleiramag.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
	
	public Double getDiscount(Double amount) {
		return amount * 0.2;
	};
}
