package utils;

import java.util.Scanner;

public class Utils { // Classe de utilidades (funções auxiliares)

    // Método para ler números decimais de forma segura
    public static float lerNumero(Scanner teclado, String mensagem) {
        while (true) { // Loop infinito até usuário digitar número válido
            System.out.print(mensagem); // Exibe mensagem pedindo o número
            if (teclado.hasNextFloat()) { // Se a entrada for um número decimal
                return teclado.nextFloat(); // Retorna o número válido
            } else {
                // Caso não seja número válido (ex: letra, símbolo, texto)
                AsciiDecorator.printErro("Número inválido. Tente novamente.");
                teclado.next(); // Descarta a entrada inválida
            }
        }
    }
}