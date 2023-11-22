package aula6e7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estudante {
	private String nome;
	private Date dataNascimento = new Date();
	private String cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Estudante(String nome, Date dataNascimento, String cpf) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	@SuppressWarnings("deprecation")
	public void printDataNascimento() {
		int dia, mes, ano;
		dia = this.dataNascimento.getDate();
		mes = this.dataNascimento.getMonth() + 1;
		ano = this.dataNascimento.getYear();
		System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
	}
	@SuppressWarnings("deprecation")
	public int calculaIdade() {
		Date hoje = new Date();
		int idade;
		idade = hoje.getYear() - this.dataNascimento.getYear(); 
		if(hoje.getMonth() < this.dataNascimento.getMonth()) {
			idade--;
		}
		else if(hoje.getMonth() == this.dataNascimento.getMonth()) {
			if(hoje.getDay() < this.dataNascimento.getDay())
				idade--;
		}
		return idade;
	}
	public static Date novaData() {
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
		return dataUsuario;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante e;
		String nome, cpf;
		Date nascimento;
		System.out.println("Digite o nome do estudante:");
		nome = sc.nextLine();
		System.out.println("Digite o CPF do estudante:");
		cpf = sc.nextLine();
		nascimento = Estudante.novaData();
		e = new Estudante(nome, nascimento, cpf);
		System.out.println("Idade: " + e.calculaIdade());
		e.printDataNascimento();
		sc.close();
	}
	
}
