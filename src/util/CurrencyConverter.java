package util;

public class CurrencyConverter {

	public static final double IOF = 6.0 / 100.0;

	public static double finalValue(double dollarValue, double quantity) {
		return (dollarValue * quantity) * (1 + IOF);
	}

}
