//Escreva um código que receba o nome e a idade de duas pessoas e imprima a diferença de idade entre elas

import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        
        System.out.println("Vamos calcular a diferença de idade entre duas pessoas. \n");
        
        System.out.println("Digite o nome da primeira pessoa: ");
        String nomeX = input.nextLine();
        System.out.printf("Digite a idade de %s: ", nomeX);
        
        
        int idadeX = idadeValida(input);
        
        input.nextLine(); 
        
        System.out.println("Digite o nome da segunda pessoa: ");
        String nomeY = input.nextLine();
        System.out.printf("Digite a idade de %s: ", nomeY);
        
        int idadeY = idadeValida(input);
      
        
        int dif = Math.abs(idadeX - idadeY);
        
        if (idadeX == idadeY) {
            System.out.printf("%1$s e %2$s possuem a mesma idade!", nomeX, nomeY);
        } else {
            System.out.printf("A diferença de idade entre %1$s e %2$s é de %3$d anos", nomeX, nomeY, dif);
        }
        
    }
    
    public static int idadeValida(Scanner input) {
         while (!input.hasNextInt()) {
            System.out.println("Digite um número inteiro!");
            input.nextLine();
        }
        int idade = input.nextInt();
        
          while (idade < 0) {
            System.out.println("Idade inválida. Digite um número maior que zero: ");
            
            while (!input.hasNextInt()) {
                System.out.println("Digite apenas números inteiros!");
                input.nextLine();
            }
            
            idade = input.nextInt();
        }
        return idade;
    }
}