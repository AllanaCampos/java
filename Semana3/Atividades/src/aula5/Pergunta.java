package aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Pergunta {
	private String textoDaPergunta;
	private ArrayList<String> listaDeAlternativas;
	private int alternativaCerta;
	
	public Pergunta(String textoDaPergunta, ArrayList<String> listaDeAlternativas, int alternativaCerta) {
		super();
		this.textoDaPergunta = textoDaPergunta;
		this.listaDeAlternativas = listaDeAlternativas;
		this.alternativaCerta = alternativaCerta;
	}
	public String getTextoDaPergunta() {
		return textoDaPergunta;
	}
	public void setTextoDaPergunta(String textoDaPergunta) {
		this.textoDaPergunta = textoDaPergunta;
	}
	public ArrayList<String> getListaDeAlternativas() {
		return listaDeAlternativas;
	}
	public void setListaDeAlternativas(ArrayList<String> listaDeAlternativas) {
		this.listaDeAlternativas = listaDeAlternativas;
	}
	public int getAlternativaCerta() {
		return alternativaCerta;
	}
	public void setAlternativaCerta(int alternativaCerta) {
		this.alternativaCerta = alternativaCerta;
	}
	public static Pergunta novaPergunta() {
		Pergunta p;
		String texto, opcao;
		int correta;
		ArrayList<String> opcoes = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a pergunta");
		texto = sc.nextLine();
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a alternativa " + (i+1));
			opcao = sc.nextLine();
			opcoes.add(opcao);
		}
		System.out.println(texto);
		for(int i = 0; i < 4; i++) {
			System.out.println((i+1) + opcoes.get(i));
		}
		do{
			System.out.println("Informe qual a alternativa correta");
			correta = sc.nextInt();
			sc.nextLine();
		}while(correta < 1 && correta > 4);
		p = new Pergunta(texto, opcoes, correta);
		return p;
		
	}
	public static void criarQuiz(ArrayList<Pergunta> perguntas) {
		Scanner sc = new Scanner(System.in);
		int resposta, acertos = 0, erros = 0;
		Pergunta p;
		ArrayList<String> alternativas;
		for(int i = 0; i < perguntas.size(); i++) {
			p = perguntas.get(i);
			alternativas = p.getListaDeAlternativas();
			System.out.println(p.getTextoDaPergunta());
			for(int j = 0; j < 4; j++) {
				System.out.println((j+1) + alternativas.get(j));
			}
			System.out.println("Resposta: ");
			resposta = sc.nextInt();
			if(resposta == p.getAlternativaCerta()) {
				System.out.println("Resposta certa!");
				acertos++;
			}
			else {
				System.out.println("Resposta errada!");
				erros++;
			}
		}
		System.out.println("Acertos: " + acertos + " Erros: " + erros); 
	}
	public static void main(String[] args) {
		ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
		int op;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("<----------MENU---------->");
			System.out.println("1- Criar Pergunta");
			System.out.println("2- Quiz");
			System.out.println("0- Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:
				perguntas.add(Pergunta.novaPergunta());
				break;
			case 2:
				Pergunta.criarQuiz(perguntas);
				break;
			}
		}while(op != 0);
		sc.close();
	}
		
}
