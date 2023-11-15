package conversor;

public class Conversor {
	private double F, C;

	public double getF() {
		return F;
	}

	public void setF(double f) {
		F = f;
	}

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}

	public Conversor() {
		super();
		F = 0;
		C = 0;
	}
	
	public double convertToCelsius() {
		this.C = (this.F - 32) * 5 / 9;
		return this.C;
	}
	
	public double convertToFahrenheit() {
		this.F = (this.C * 9 / 5) + 32;
		return this.F;
	}
}
