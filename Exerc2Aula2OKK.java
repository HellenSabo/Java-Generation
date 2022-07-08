package br.com.generation.Exerc2Aula2;

import java.util.Scanner;
public class Exerc2Aula2OKK {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Olá, vamos colocar três números diferentes em ordem crescente!");
		System.out.println("Por favor, digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Agora, digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Por fim, digite o terceiro e último número: ");
		n3 = leia.nextInt();

		if (n1 < n2) {
			if (n2 < n3) {
				System.out.println("A ordem crescente é: " + n1 + ", " + n2 + ", " + n3);
			} 
			else if (n1 < n3) {
				System.out.println("A ordem crescente é: " + n1 + ", " + n3 + ", " + n2);
			} else {
				System.out.println("A ordem crescente é: " + n3 + ", " + n1 + ", " + n2);
			}
		}
		else if (n2 < n3) {
			if (n1 < n3) {
				System.out.println("A ordem crescente é: " + n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println("A ordem crescente é: " + n2 + ", " + n3 + ", " + n1);
			}
		} else {
			System.out.println("A ordem crescente é: " + n3 + ", " + n2 + ", " + n1);
		}


	}

}
