package aula6e7;

import java.util.ArrayList;
import java.util.Comparator;

public class ListaNumeros {
	private ArrayList<Float> numeros;
	
	
	public ListaNumeros() {
		numeros = new ArrayList<Float>();
	}

	public void novoNumero(float f) {
		this.numeros.add(f);
	}
	public void listaNumeros() {
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}
	public void media() {
		float media = 0;
		for(int i = 0; i < numeros.size(); i++) {
			media += numeros.get(i);
		}
		System.out.println("Media: " + media);
	}
	public void ordena() {
		this.numeros.sort(Comparator.naturalOrder());
	}
	public void mediana() {
		int tam = this.numeros.size();
		if(tam % 2 == 0) {
			float media;
			media = this.numeros.get((tam/2) - 1) + this.numeros.get(tam/2);
			media = media/2;
			System.out.println("Mediana: " + media);
		}
		else {
			System.out.println("Mediana: " + this.numeros.get((tam/2) + 1));
		}
	}
	public void colocadoEM(int N) {
		System.out.println("O " + N + "\u00BA maior numero é: " + this.numeros.get(this.numeros.size() - N));
	}
	public static void main(String[] args) {
		ListaNumeros lista = new ListaNumeros();
		lista.novoNumero(9);
		lista.novoNumero(8.9F);
		lista.novoNumero(12.5F);
		lista.novoNumero(5.8F);
		lista.novoNumero(1.23F);
		lista.novoNumero(4.75F);
		lista.listaNumeros();
		lista.media();
		lista.ordena();
		System.out.println("Lista ordenada:");
		lista.listaNumeros();
		lista.mediana();
		lista.colocadoEM(4);
	}
}
