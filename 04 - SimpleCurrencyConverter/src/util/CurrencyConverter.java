package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	public static double Converter (double dollars, double dollarPrice) {
		double reais = dollars * dollarPrice;
		return reais + (reais * IOF) ;
	}
}
