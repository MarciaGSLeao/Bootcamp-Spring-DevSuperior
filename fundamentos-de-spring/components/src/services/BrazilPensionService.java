package services;

public class BrazilPensionService extends PensionService{
	
	@Override
	public double discount(double amount) {
		return amount * 0.14;
	}
}
