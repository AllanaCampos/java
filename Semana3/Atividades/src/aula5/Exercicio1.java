package aula5;

import java.util.Scanner;

public class Exercicio1 {
	public static int Soma(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois valores:");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("A soma de " + x + " com " + y + " é: " + Exercicio1.Soma(x, y));
		sc.close();
	}
}
