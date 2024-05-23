// Importa a classe Scanner do pacote java.util para ler a entrada do usuário

import java.util.Scanner;

public class VerificarElegibilidade {

    public static void main(String[] args) {
        // Utiliza try-with-resources para garantir que o Scanner será fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Lê a idade digitada pelo usuário
            int idade = scanner.nextInt();

            // Verifica se a idade é maior ou igual a 18
            if (idade >= 18) {
                // Se a idade for maior ou igual a 18, exibe mensagem de elegibilidade
                System.out.println("Voce esta elegivel para criar uma conta bancaria.");
            } else {
                // Se a idade for menor que 18, exibe mensagem de não elegibilidade
                System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            }
        }
    }
}
