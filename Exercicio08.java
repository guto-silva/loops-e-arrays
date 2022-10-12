/*
 * Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
*/

public class Exercicio08 {
    public static void main(String[] args) {
        char letras[] = {'h', 'i', 'p', 'o', 't', 'e', 'n', 's', 'a'};
        int quantidadeConsoantes = 0;

        for(int i = 0; i < letras.length; i++) {
            if(letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                quantidadeConsoantes++;
            }
        }


        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.print("Consoantes:");
        for(int i = 0; i < letras.length; i++) {
            if(letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                System.out.print(" " + letras[i]);
            }
        }
        System.out.println();
    }
}
