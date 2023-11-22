package aula5;

import java.util.Scanner;

public class Exercicio9 {
	public static float sum(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float sub(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float mul(float num1, float num2) {
		return num1 * num2;
	}
	
	public static float div(float num1, float num2) {
		return num1 / num2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		int op = 0, ch = 0;
		do{
			System.out.println("Informe dois numeros");
			num1 = sc.nextFloat();
			num2 = sc.nextFloat();
			do{
				System.out.println("Digite a operacao que deseja");
				System.out.println("1- Soma");
				System.out.println("2- Subtracao");
				System.out.println("3- Multiplicacao");
				System.out.println("4- Divisao");
				System.out.println("0- Sair");
				op = sc.nextInt();
				switch(op) {
				case 1:
					System.out.println("O resultado da soma de " + num1 + " com " + num2 + " é: " + Exercicio9.sum(num1, num2));
					break;
				case 2:
					System.out.println("O resultado da subtracao de " + num1 + " por " + num2 + " é: " + Exercicio9.sub(num1, num2));
					break;
				case 3:
					System.out.println("O resultado da multiplicacao de " + num1 + " com " + num2 + " é: " + Exercicio9.mul(num1, num2));
					break;
				case 4:
					System.out.println("O resultado da divisao de " + num1 + " por " + num2 + " é: " + Exercicio9.div(num1, num2));
					break;
				}
			}while(op!=0);
			System.out.println("Deseja informar novos numeros?");
			System.out.println("1- Sim");
			System.out.println("2- Nao");
			ch = sc.nextInt();
		}while(ch == 1);
		sc.close();		
	}
}
