/*
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
*/

public class Exercicio07 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};

        for(int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}