package com.gameleiramag.services;

import org.springframework.stereotype.Service;

@Service
public class PensionServiceBrazil extends PensionService{

	@Override
	public Double getDiscount(Double amount) {
		return amount * 0.14;
	}

}
