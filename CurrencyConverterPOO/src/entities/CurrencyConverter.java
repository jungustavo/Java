package entities;

public class CurrencyConverter {
	
	
	public static final double IOF = 0.06;
	
		
	public static double converter(double dollarPrice, double dollarquantity) {
		double price = dollarPrice * dollarquantity;
		price += (price * IOF);
		return price;
	}

}
