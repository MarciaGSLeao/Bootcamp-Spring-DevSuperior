package com.gameleiramag.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	public Double getTax(Double amount) {
		return amount * 0.1;
	};
	
}
