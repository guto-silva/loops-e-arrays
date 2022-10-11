/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada
 * de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50 
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número da tabuada que deseja ver: ");
        int numero = leia.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + i*numero);
        }

        leia.close();

    }
}
