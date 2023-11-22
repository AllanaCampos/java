package aula5;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Utilizando variavel temporaria");
		System.out.println("Digite dois inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("A: " + a + " B: "+ b);
		c = a;
		a = b;
		b = c;
		System.out.println("A: " + a + " B: "+ b);
		System.out.println("Utilizando XOR");
		System.out.println("Digite dois inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("A: " + a + " B: "+ b);
		sc.close();
	}
}
