package calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc;
		double num1, num2;
		int op = 0, ch = 0;
		do{
			System.out.println("Informe dois numeros");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			calc = new Calculadora(num1, num2);
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
					System.out.println("O resultado da soma de " + calc.getNum1() + " com " + calc.getNum2() + " eh: " + calc.sum());
					break;
				case 2:
					System.out.println("O resultado da subtracao de " + calc.getNum1() + " por " + calc.getNum2() + " eh: " + calc.sub());
					break;
				case 3:
					System.out.println("O resultado da multiplicacao de " + calc.getNum1() + " com " + calc.getNum2() + " eh: " + calc.mul());
					break;
				case 4:
					System.out.println("O resultado da divisao de " + calc.getNum1() + " por " + calc.getNum2() + " eh: " + calc.div());
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
