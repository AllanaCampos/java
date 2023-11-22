package aula5;

public class Tipo {
	public static void comparacaoFloatDouble() {
		float x, y;
		x = 2;
		do {
			y = x;
			x = x/2;
		}while(x > 0);
		System.out.println(y);
		double x2, y2;
		x2 = 2;
		do {
			y2 = x2;
			x2 = x2/2;
		}while(x2 > 0);
		System.out.println(y2);
	}
	public static void main(String[] args) {
		Tipo.comparacaoFloatDouble();
	}
}
