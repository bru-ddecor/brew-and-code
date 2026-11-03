//Escreva um código que receba o nome e a idade de duas pessoas e imprima a diferença de idade entre elas

import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        System.out.println("Vamos calcular a diferença de idade entre duas pessoas. \n");
        
        System.out.println("Digite o nome da pessoa mais velha: ");
        String nomeX = input.next();
        System.out.printf("Digite a idade de %s: ", nomeX);
        int idadeX = input.nextInt();
        
        System.out.println("Digite o nome da pessoa mais nova: ");
        String nomeY = input.next();
        System.out.printf("Digite a idade de %s: ", nomeY);
        int idadeY = input.nextInt();
        
        int dif = idadeX - idadeY;
        
        System.out.printf("A diferença de idade entre %1$s e %2$s é de %3$d anos", nomeX, nomeY, dif);
    }
}

