package com.gameleiramag.services;

import org.springframework.stereotype.Service;

@Service
public class TaxServiceBrazil extends TaxService{

	@Override
	public Double getTax(Double amount) {
		return amount * 0.21;
	}

}
