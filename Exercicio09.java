/*
* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
* Ao final mostre os números e seus sucessores.
*/

import java.util.Random;
public class Exercicio09 {
    public static void main(String[] args) {
       
        int numeros[] = new int[20];
        Random random = new Random();

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.printf("Numero: %d | Sucessor: %d | Antecessor: %d\n", numeros[i], numeros[i] + 1, numeros[i] - 1);
        }
    }
}