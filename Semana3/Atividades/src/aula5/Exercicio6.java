package aula5;

import java.util.Scanner;

public class Exercicio6 {
	public static float area(float b, float h) {
		float area = b * h;
		return area;
	}
	public static void main(String[] args) {
		float b, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a largura do retângulo:");
		b = sc.nextFloat();
		System.out.println("Digite a altura do retângulo:");
		h = sc.nextFloat();
		System.out.println("A área do retângulo é: " + Exercicio6.area(b, h)) ;
		sc.close();
	}
}
