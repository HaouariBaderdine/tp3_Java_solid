package Exemple2;

public class InterestCalculator {
	public double calculateInterest(String accountType, double balance) {
		if ("Saving".equals(accountType)) {
			return balance * 0.3;
		} else {
			return balance * 0.5;
		}
	}
}
