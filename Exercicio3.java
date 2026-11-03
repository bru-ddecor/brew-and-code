//Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela o resultado

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Digite o valor do lado X do retângulo: ");
        int x = input.nextInt();
        System.out.println("Digite o valopr Y do retângulo: ");
        int y = input.nextInt();
        
        int resultado = x * y;
        
        System.out.printf("A área do retângulo é de %d m^2", resultado);
    }
}