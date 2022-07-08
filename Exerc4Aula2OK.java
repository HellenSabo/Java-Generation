package Exercicio4Aula2;
import java.util.Scanner;
public class Exerc4Aula2OK
{

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		double num;

		System.out.println("Vamos descobrir se o número é par ou ímpar!");
		System.out.println("\nDigite um número qualquer: ");
		num = leia.nextInt();

		if (num % 2 == 0) {
			num = Math.sqrt(num);
			System.out.println("Nesta rodada, o número registrado é par! E, como bônus, sua raiz quadrada é: " + num);
		} else {
			num = Math.pow(num, 2);
			System.out.println("Nesta rodada, o número registrado é ímpar! E, como bônus, o seu quadrado é: " + num);
		}

	}

}
