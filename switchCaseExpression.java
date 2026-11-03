import java.util.Scanner;

public class switchCaseExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua nota de 0 a 10");
        int nota = input.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Apenas números de 1 a 10!");
            nota = input.nextInt();
        }
        

    String resultado = switch (nota) {
        case 8, 9, 10 -> {
        System.out.println("Parabéns pela nota!");
        yield "Aprovado";
        }
        case 5, 6, 7 -> "Você está de recuperação!";
        default -> "Reprovado";
    };
        System.out.println(resultado);
    }
}