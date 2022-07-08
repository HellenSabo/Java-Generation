package br.com.generation.Exerc1Aula2;

import java.util.Scanner; 

public class Exercício1Aula2OK {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1,n2,n3;

		System.out.println("Olá, vamos calcular qual número é o maior entre três números diferentes!");
		System.out.println("\nPor favor, informe o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nAgora, informe o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nPor fim, iInforme o terceiro número: ");
		n3 = leia.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("Nessa rodada, o primeiro número, " + n1 + ", ganhou como maior!");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("Nessa rodada, o segundo número, " + n2 + ", ganhou como maior!");
		} else {
			System.out.println("Nessa rodada, o terceiro número, " + n3 + ", ganhou como maior!");

	}

}
	
}
