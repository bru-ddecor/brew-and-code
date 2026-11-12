// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

import java.util.Scanner;

public class TabuadaDIO {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número para obter a tabuada: ");
        int num = input.nextInt();
        
        
        
        for(int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + "x" + i + "= " + result);
        }
    }
}