package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome, email, nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadeDePostagens;
	private int pontuacao;
	public Usuario(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.postagens = new ArrayList<String>();
		this.quantidadeDePostagens = 0;
		this.pontuacao = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getQuantidadeDePostagens() {
		return quantidadeDePostagens;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public void adicionaPostagem(String post) {
		this.postagens.add(post);
		this.quantidadeDePostagens++;
	}
	
	public void alteraPontuacao(int delta) {
		this.pontuacao += delta;
		if(this.pontuacao < 0) {
			this.pontuacao = 0;
		}
	}
	
	public void mostrarPostagens() {
		System.out.println("<----------Postagens---------->");
		for(int i = 0; i < postagens.size(); i++) {
			System.out.println(postagens.get(i));
		}
	}
	
	public static void mostrarUsuarios(ArrayList<Usuario> listaUsuarios){
		System.out.println("<----------Usuários---------->");
		for(int i = 0; i < listaUsuarios.size(); i++) {
			System.out.println("Usuário " + (i + 1));
			System.out.println("Nome: " + listaUsuarios.get(i).getNome());
			System.out.println("Email: " + listaUsuarios.get(i).getEmail());
			System.out.println("Nacionalidade: " + listaUsuarios.get(i).getNacionalidade());
		}
	}
	public static void main(String[] args) {
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String nome, nacionalidade, email;
		Usuario usuario;
		int op, indice;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("<----------MENU---------->");
			System.out.println("1- Adicionar usuário");
			System.out.println("2- Menu de Usuário");
			System.out.println("0- Sair");
			op = sc.nextInt();
			sc.nextLine();
			if(op == 1){
				System.out.println("Digite o nome do usuário:");
				nome = sc.nextLine();
				System.out.println("Digite o email do usuário:");
				email = sc.nextLine();
				System.out.println("Digite a nacionalidade do usuário:");
				nacionalidade = sc.nextLine();
				usuario = new Usuario(nome, email, nacionalidade);
				listaUsuarios.add(usuario);
			}
			if(op == 2){
				mostrarUsuarios(listaUsuarios);
				System.out.println("Digite o índice do usuário: (Ex: caso seja Usuário 2, o índice será 2)");
				indice = sc.nextInt();
				menuUsuario(listaUsuarios, indice-1);
			}
		}while(op != 0);
		
		
				
		sc.close();
	}
	public static void menuUsuario(ArrayList<Usuario> listaUsuarios, int indice){
		Usuario usuario = listaUsuarios.get(indice);
		Scanner sc = new Scanner(System.in);
		String postagem;
		int op, delta;
		do {
			System.out.println("<----------MENU---------->");
			System.out.println("1- Adicionar postagem");
			System.out.println("2- Visualizar postagens");
			System.out.println("3- Visualizar quantidade de postagens");
			System.out.println("4- Visualizar pontuacao");
			System.out.println("5- Adicionar a pontuacao");
			System.out.println("0- Sair");
			
			op = sc.nextInt();
			sc.nextLine();
			if (op == 1) {
				System.out.println("Digite uma postagem:");
				postagem = sc.nextLine();
				usuario.adicionaPostagem(postagem);
			}
			else if (op == 2) 
				usuario.mostrarPostagens();
			else if (op == 3) 
				System.out.println("Quantidade de postagens: " + usuario.getQuantidadeDePostagens());
			else if (op == 4) 
				System.out.println("Pontuação: " + usuario.getPontuacao());
			else if (op == 5) {
				System.out.println("Digite a pontuação que deseja incrementar:");
				delta = sc.nextInt();
				sc.nextLine();
				usuario.alteraPontuacao(delta);
			}
		} while (op != 0);
	}
}
