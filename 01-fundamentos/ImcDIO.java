// "Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:"

import java.util.Scanner;

public class ImcDIO {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        
        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        
        double imc = peso / (altura * altura);
        
        if(imc <= 18.59) {
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.6 && imc < 25) {
            System.out.println("Peso ideal");
        } else if(imc >= 25 && imc <30) {
            System.out.println("Levemente acima do peso");
        } else if(imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if(imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");
        } else if(imc >= 40) {
            System.out.println("Obesidade III (Mórbida)");
        } 
    }
}