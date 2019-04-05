package inheritance;

public class IncomeTax {
	
	public int calculateTax(int annualIncome) {
		return annualIncome/10;
	}
	
	public float calculateTax(float annualIncome) {
		return annualIncome/10;
	}

	public int calculateTax(int annualIncome, int luxurySpend) {
		return annualIncome/10 + luxurySpend/20;
	}
	
}
