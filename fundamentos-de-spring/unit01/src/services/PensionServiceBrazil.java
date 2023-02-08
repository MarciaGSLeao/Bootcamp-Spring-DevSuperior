package services;

public class PensionServiceBrazil implements PensionService{

	@Override
	public Double getDiscount(Double amount) {
		return amount * 0.1;
	}

}
