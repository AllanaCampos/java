package exemplo;

import java.util.Scanner;

public class Cliente {
	private String nome, cpf;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = 0;
	}

	public static void main(String[] args) {
		String nome, cpf;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite o CPF: ");
		cpf = sc.nextLine();
		Cliente c1 = new Cliente(nome, cpf);
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Idade: " + c1.getIdade());
		int op, idade;
		do {
			System.out.println("<----------MENU---------->");
			System.out.println("1- Atualizar o nome");
			System.out.println("2- Atualizar o CPF");
			System.out.println("3- Atualizar a idade");
			System.out.println("4- Apresentar os dados");
			System.out.println("0- Sair");
			
			op = sc.nextInt();
			sc.nextLine();
			if (op == 1) {
				System.out.println("Digite o nome: ");
				nome = sc.nextLine();
				c1.setNome(nome);
			}
			else if (op == 2) {
				System.out.println("Digite o CPF: ");
				cpf = sc.nextLine();
				c1.setCpf(cpf);
			}
			else if (op == 3) {
				System.out.println("Digite a idade: ");
				idade = sc.nextInt();
				c1.setIdade(idade);
			}		
			else if (op == 4) {
				System.out.println("Nome: " + c1.getNome());
				System.out.println("CPF: " + c1.getCpf());
				System.out.println("Idade: " + c1.getIdade());
			}
		} while (op != 0);		
		sc.close();
	}

}
