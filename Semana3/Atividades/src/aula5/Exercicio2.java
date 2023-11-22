package aula5;

import java.util.Scanner;

public class Exercicio2 {
	public static float Media(float x, float y, float z, float px, float py, float pz) {
		float soma, media, somap;
		somap = px + py + pz;
		soma = (x * px) + (y * py) + (z * pz);
		media = soma / somap;
		return media;
	}
	public static void main(String[] args) {
		float x, y, z, px, py, pz;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe três ntas:");
		x = sc.nextFloat();
		y = sc.nextFloat();
		z = sc.nextFloat();
		System.out.println("Informe o peso da nota " + x + ":");
		px = sc.nextFloat();
		System.out.println("Informe o peso da nota " + y + ":");
		py = sc.nextFloat();
		System.out.println("Informe o peso da nota " + z + ":");
		pz = sc.nextFloat();
		System.out.println("A media das notas é: " + Exercicio2.Media(x, y, z, px, py, pz));
		sc.close();
	}
}
