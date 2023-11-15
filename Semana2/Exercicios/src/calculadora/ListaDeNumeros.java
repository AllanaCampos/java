package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNumeros {
	private ArrayList<Float> numeros;

	public ListaDeNumeros() {
		numeros = new ArrayList<Float>();
	}

	public void addNumero(Float n) {
		this.numeros.add(n);
	}

	public Float media() {
		Float m = 0F;
		
		for (int i = 0; i < numeros.size(); i++) {
			m += numeros.get(i);
		}
		m = m / numeros.size();
		return m;
	}

	public static void main(String[] args) {
		ListaDeNumeros lista = new ListaDeNumeros();
		Scanner sc = new Scanner(System.in);
		Float num;
		do {
			System.out.println("Digite um número: ");
			num = sc.nextFloat();
			if (num > 0)
				lista.addNumero(num);
		} while (num > 0);
		
		System.out.println("Média: " + lista.media());
		sc.close();
	}

}
