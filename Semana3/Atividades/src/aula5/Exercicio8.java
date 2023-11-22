package aula5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio8 {
	public static void maiorIdade(int idade) {
		if(idade < 18) {
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Maior de idade");
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void maiorDeIdade(Date nascimento) {
		Date hoje = new Date();
		int idade;
		idade = hoje.getYear() - nascimento.getYear(); 
		if(hoje.getMonth() < nascimento.getMonth()) {
			idade--;
		}
		else if(hoje.getMonth() == nascimento.getMonth()) {
			if(hoje.getDay() < nascimento.getDay())
				idade--;
		}
		if(idade < 18) {
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Maior de idade");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data;
		Date dataUsuario = new Date();
		System.out.println("Digite a data de nascimento: DD/MM/YYYY");
		data = sc.nextLine();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataUsuario = sdf1.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.print("O usuário é ");
		Exercicio8.maiorDeIdade(dataUsuario);
		System.out.print("Quem tem 25 anos de idade é ");
		Exercicio8.maiorIdade(25);
	}
}
