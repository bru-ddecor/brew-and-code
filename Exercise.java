import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome =  input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        
        System.out.printf("Olá, %s! você tem %d anos", nome, idade);
    }
}