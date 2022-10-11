/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares;
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);        

        int tamanho = 0, quantidadePar = 0, quantidadeImpar = 0;

        tamanho = leia.nextInt();

        int numeros[] = new int[tamanho];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = leia.nextInt();
            if(numeros[i] % 2 == 0) {
                quantidadePar++;
            }
            else {
                quantidadeImpar++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePar);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpar);

        leia.close();
    }
}
