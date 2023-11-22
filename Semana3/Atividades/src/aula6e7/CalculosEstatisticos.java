package aula6e7;

public class CalculosEstatisticos {
	public static int fatorial(int x) {
		if(x < 2)
			return 1;
		else
			return x * fatorial(x-1);
	}
	public static int arranjo(int N, int P) {
		int a;
		a = fatorial(N)/fatorial(N-P);
		return a;
	}
	public static int combinacao(int N, int P) {
		int c;
		c = fatorial(N)/(fatorial(P) * fatorial(N-P));
		return c;
	}
	public static void main(String[] args) {
		int a = 5;
		System.out.println(fatorial(a));
		System.out.println(arranjo(8, 3));
		System.out.println(combinacao(8,4));
	}
}
