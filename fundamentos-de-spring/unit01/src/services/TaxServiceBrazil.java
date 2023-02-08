package services;

public class TaxServiceBrazil implements TaxService{

	@Override
	public Double getTax(Double amount) {
		return amount * 0.2;
	}

}
