package utils;

public class Operacoes { // Classe que contém os cálculos matemáticos

    // Método responsável por realizar a operação escolhida
    public static float calcular(int opcao, float n1, float n2) {
        switch (opcao) {
            case 1:
                return n1 + n2; // Operação de soma
            case 2:
                return n1 - n2; // Operação de subtração
            case 3:
                return n1 * n2; // Operação de multiplicação
            case 4:
                if (n2 == 0) { // Tratamento para evitar divisão por zero
                    AsciiDecorator.printErro("Erro: divisão por zero!");
                    return Float.NaN; // Valor especial indicando erro
                }
                return n1 / n2; // Operação de divisão
            default:
                // Caso o usuário tente uma operação que não existe
                AsciiDecorator.printErro("Opção inválida!");
                return Float.NaN;
        }
    }
}