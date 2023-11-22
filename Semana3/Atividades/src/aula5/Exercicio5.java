package aula5;

import java.util.Scanner;

public class Exercicio5 {
	public static float convertToCelsius(float F) {
		float C;
		C = (F - 32) * 5 / 9;
		return C;
	}
	
	public static float convertToFahrenheit(float C) {
		float F;
		F = (C * 9 / 5) + 32;
		return F;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float temp;
		int op = 0;
		do{
			System.out.println("<----------MENU---------->");
			System.out.println("1- Converter de Celsius para Fahrenheit");
			System.out.println("2- Converter de Fahrenheit para Celsius");
			System.out.println("0- Sair");
			op = sc.nextInt();
			switch (op){
			case 1:
				System.out.println("Digite a temperatura em Celsius");
				temp = sc.nextFloat();
				System.out.println(temp + " graus Celsius corresponde a " + Exercicio5.convertToFahrenheit(temp) + " graus em Fahrenheit.");
				break;
			case 2:
				System.out.println("Digite a temperatura em Fahrenheit");
				temp = sc.nextFloat();
				System.out.println(temp + " graus em Fahrenheit corresponde a " + Exercicio5.convertToCelsius(temp) + " graus Celsius.");
				break;
			}
		}while(op != 0);		
		sc.close();
	}
}
