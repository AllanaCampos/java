package conversor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conversor conv = new Conversor();
		double temp;
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
				temp = sc.nextDouble();
				conv.setC(temp);
				System.out.println(conv.getC() + " graus Celsius " + " corresponde a " + conv.convertToFahrenheit() + " graus em Fahrenheit.");
				break;
			case 2:
				System.out.println("Digite a temperatura em Fahrenheit");
				temp = sc.nextDouble();
				conv.setF(temp);
				System.out.println(conv.getF() + " graus em Fahrenheit " + " corresponde a " + conv.convertToCelsius() + " graus Celsius.");
				break;
			}
		}while(op != 0);		
		sc.close();
	}
}
