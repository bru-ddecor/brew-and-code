//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int x = xValido(input);
        
        System.out.println("Digite um número maior que o primeiro: ");
        int y = yValido(input, x);
        
        System.out.println("Digite a letra 'p' para selecionar números pares ou 'i' para números ímpares: ");
        String parImpar = parImpar(input);
        
        if(parImpar.equalsIgnoreCase("p")) {
            for(int i = y; i >=x; i--) {
                if (i % 2 == 0) {
                System.out.println(i);}
            }
        } else for(int i = y; i >=x; i--) {
            if(i % 2 != 0) {
            System.out.println(i);}
            }
    }
    
    public static String parImpar(Scanner input) {
        String parImpar = input.next();
        
        while(!parImpar.equalsIgnoreCase("p") && !parImpar.equalsIgnoreCase("i")) {
            System.out.println("Digite a letra 'p' para selecionar números pares ou 'i' para números ímpares: ");
            parImpar = input.next();
        }
        
        return parImpar;
    }
    
    public static int xValido(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.println("Digite apenas números inteiros: ");
            input.next();
        }
        
        int x = input.nextInt();
        return x;
    }
    
    public static int yValido(Scanner input, int x) {
        int y = xValido(input);
        
        while (y <= x) {
            System.out.println("O segundo número deve ser maior que o primeiro:");
            y = xValido(input);
        }
        return y;
    }
    
}