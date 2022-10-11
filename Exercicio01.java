/*
 * Faça um programa que leia conjunstos de dois valores,
 *  o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome = "";
        int idade = 0;

        while(true) {
            System.out.println("Nome: ");
            nome = leia.next();

            if(nome.equals("0")) {
                break;
            }

            System.out.println("Idade: ");
            idade = leia.nextInt();

               
        }
        leia.close();
    }
}