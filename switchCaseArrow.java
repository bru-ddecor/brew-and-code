import java.util.Scanner;

public class switchCaseArrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        int opcao = input.nextInt();
        String mensagem = switch (opcao) {
            case 1, 7 -> {
                var dia = opcao == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana!! \\o/", dia);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";
            
        };
        System.out.println(mensagem);
        
    }
}