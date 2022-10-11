/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe um valor válido. 
*/

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite uma nota: ");
    int nota;
    nota = leia.nextInt();

    while(nota < 0 || nota > 10) {
        System.out.println("Nota inválida!\nDigite outra nota: ");
        nota = leia.nextInt();
    }

    leia.close();
  }
}
