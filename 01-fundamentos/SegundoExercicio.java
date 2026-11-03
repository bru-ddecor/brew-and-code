//Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba o resultado na tela

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Qual o valor do lado do quadrado?: ");
        int lado = input.nextInt();
        int resultado = lado * lado;
        System.out.printf("Calculando a área do quadrado, obtivemos o valor de: %d m^2", resultado);
    }
}