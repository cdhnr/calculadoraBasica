//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Importações de classes utilitárias criadas no projeto
import utils.AsciiDecorator;
import utils.Operacoes;
import utils.Utils;

import java.util.Scanner; // Importa a classe Scanner para capturar entrada do usuário

public class Main { // Classe principal que contém o método de execução do programa

    public static void main(String[] args) { // Ponto de entrada do programa
        Scanner teclado = new Scanner(System.in); // Objeto Scanner para ler dados digitados pelo usuário

        int opcao = -1; // Variável que guarda a escolha do usuário (inicializada com valor inválido)

        // Loop principal da calculadora - só encerra quando o usuário digita 0
        do {
            AsciiDecorator.printTitulo("CALCULADORA BÁSICA"); // Exibe título estilizado
            AsciiDecorator.printMenu(); // Exibe menu de operações disponíveis

            System.out.println("Digite a operação desejada: ");

            // Verifica se o usuário digitou um número inteiro válido
            if (teclado.hasNextInt()) {
                opcao = teclado.nextInt(); // Lê a opção escolhida
            } else {
                // Caso o usuário digite letras ou símbolos
                AsciiDecorator.printErro("Digite apenas números, não letras!");
                teclado.next(); // Descarta entrada inválida
                opcao = -1; // Mantém valor inválido para continuar no loop
            }

            // Se o usuário escolheu uma operação válida (1 a 4)
            if (opcao >= 1 && opcao <= 4) {
                float n1 = Utils.lerNumero(teclado, "Digite o primeiro número: "); // Solicita número 1
                float n2 = Utils.lerNumero(teclado, "Digite o segundo número: ");  // Solicita número 2

                // Executa a operação matemática escolhida
                float resultado = Operacoes.calcular(opcao, n1, n2);

                // Só imprime resultado se não houve erro (ex: divisão por zero retorna NaN)
                if (!Float.isNaN(resultado)) {
                    System.out.println("Resultado: " + resultado);
                }
            }
            // Se não for 0 e não estiver no intervalo válido
            else if (opcao != 0) {
                AsciiDecorator.printErro("Escolha apenas entre 1 e 4 para calcular as operações ou 0 para encerrar o programa.");
            }

        } while (opcao != 0); // Sai do loop somente quando usuário digita 0

        System.out.println("Programa encerrado."); // Mensagem final ao sair
    }
}