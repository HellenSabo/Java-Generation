package Exercício3Aula2;

import java.util.Scanner;
public class Exerc3Aula2OK {

	public static void main(String[] args) {
		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Precisamos classificar as pessoas por idade!");
		System.out.println("\nDigite a idade numericamente: ");
		idade = leia.nextInt();

		if (idade>=10 && idade <=14) {
			System.out.println("\nA idade registrada corresponde à faixa etária: INFANTIL.");
		} else if (idade>=15 && idade<=17) {
			System.out.println("\nA idade registrada corresponde à faixa etária: JUVENIL.");
		} else {
			System.out.println("\nA idade registrada corresponde à faixa etária: ADULTO.");
		}

	}

}
