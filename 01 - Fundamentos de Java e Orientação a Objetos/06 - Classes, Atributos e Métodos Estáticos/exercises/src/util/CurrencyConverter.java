package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dolarToReal(double amountDolar, double priceDolar) {
		double totalReal = priceDolar * amountDolar;
		double totalIOF = IOF * totalReal;
		return totalReal + totalIOF;
	}

}
