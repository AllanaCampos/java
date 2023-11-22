package aula5;

import java.util.Scanner;

public class Exercicio3 {
	public static String digita() {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string:");
		s = sc.nextLine();
		return s;
	}
	public static void exibir(String s) {
		System.out.println("As strings concatenadas formam: " + s);
	}
	public static void main(String[] args) {
		String s1, s2, s3;
		s1 = Exercicio3.digita();
		s2 = Exercicio3.digita();
		s3 = s1 + s2;
		Exercicio3.exibir(s3);
	}
}
