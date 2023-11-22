package aula6e7;

import java.util.ArrayList;

public class GeradorPrimo {
	public static ArrayList<Integer> divisores(int n) {
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				divisores.add(i);
			}
		}
		return divisores;
	}
	private static int qtdDivisores(int n) {
		int qtd;
		qtd = divisores(n).size();
		return qtd;
	}
	public static boolean primo(int n) {
		boolean p;
		if(qtdDivisores(n) == 2 || n == 1)
			p = true;
		else
			p = false;
		return p;
	}
	public static void numerosPrimos(int n) {
		for(int i = 1; i <= n; i++) {
			if(primo(i))
				System.out.println(i);
		}
	}
	public static void nPrimos(int n) {
		int i = 0;
		int qtd = 0;
		while(qtd < n) {
			if(primo(i)) {
				System.out.println(i);
				qtd++;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		System.out.println("Divisores de 6: " + divisores(6));
		System.out.println("7 é primo? " + primo(7));
		System.out.println("Numeros primos menores ou iguais a 6: ");
		numerosPrimos(6);
		System.out.println("Os 6 primeiros numeros primos são: ");
		nPrimos(6);
		
	}
}
