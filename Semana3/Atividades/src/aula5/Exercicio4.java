package aula5;

import java.util.Scanner;

public class Exercicio4 {
	public static void paridade(int i) {
		if(i % 2 == 0) 
			System.out.println("O valor " + i + " é par.");
		else
			System.out.println("O valor " + i + " é impar.");
	}
	
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma valor:");
		i = sc.nextInt();
		Exercicio4.paridade(i);
		sc.close();
	}
}
