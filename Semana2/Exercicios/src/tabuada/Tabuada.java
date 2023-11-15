package tabuada;

import java.util.Scanner;

public class Tabuada {
	public static void mul(double n) {
		for (int i = 1; i < 11; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		int op = 0;
		do {
			System.out.println("<----------MENU---------->");
			System.out.println("1- Tabuada");
			System.out.println("0- Sair");
			op = sc.nextInt();
			sc.nextLine();
			if (op == 1) {
				System.out.println("Digite um numero: ");
				num = sc.nextDouble();
				sc.nextLine();
				mul(num);
			}

		} while (op != 0);
		sc.close();

	}
}
