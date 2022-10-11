/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = leia.nextInt();
        int fatorial = 1;

        for(int i = numero; i>=1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        leia.close();
    }
}
