/*
 * Faça um programa que leia 5 números
 * e informe o maior número e a
 * média desses números.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num[] = new int[5];
        int maior = 0;
        double soma = 0;
        double media = 0.0;
        
        for(int i = 0; i < num.length; i++) {
            num[i] = leia.nextInt();
            soma += num[i];
        }
        
        maior = num[0];
        media = soma / num.length;

        for(int i = 1; i < num.length; i++) {
            
            if(num[i] > maior) {
                maior = num[i];
            }
        }        

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);

        leia.close();
    }
}
