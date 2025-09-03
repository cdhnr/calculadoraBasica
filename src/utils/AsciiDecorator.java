package utils;

public class AsciiDecorator { // Classe responsável por decorar a saída no console

    // Imprime um título estilizado com bordas
    public static void printTitulo(String titulo) {
        System.out.println("==============================");
        System.out.println("     " + titulo);
        System.out.println("==============================");
    }

    // Exibe o menu de operações disponíveis
    public static void printMenu() {
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Encerrar calculadora");
    }

    // Exibe mensagem de erro padronizada
    public static void printErro(String msg) {
        System.out.println("[ERRO] " + msg);
    }
}
