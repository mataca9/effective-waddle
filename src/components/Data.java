package components;

public class Data {
	private double amount;
	private double rate;
	private int numPeriods;

	public Data(double amount, double rate, int numPeriods) {
		this.amount = amount;
		this.rate = rate;
		this.numPeriods = numPeriods;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getNumPeriods() {
		return numPeriods;
	}

	public void setNumPeriods(int numPeriods) {
		this.numPeriods = numPeriods;
	}
}