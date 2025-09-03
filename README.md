## Descrição

Este projeto é uma **calculadora de linha de comando** simples, desenvolvida em Java. Ele foi criado como um exercício para demonstrar a evolução de um código, aplicando conceitos de **modularização**, **melhores práticas de programação** e **organização de projeto**.

O código inicial era monolítico, com todas as funcionalidades concentradas em uma única classe. A versão atual, em contraste, refatora o projeto para uma **estrutura modular**, separando as responsabilidades em diferentes classes e pacotes.

---
## Estrutura de Pastas

A estrutura atual do projeto segue uma organização lógica e escalável.

```
LICENSE.txt
README.md
└── src/
├── utils/
│   ├── AsciiDecorator.java
│   ├── Operacoes.java
│   └── Utils.java
└── Main.java
```

* `src/`: Contém todo o código-fonte da aplicação.
* `utils/`: Pacote com classes utilitárias para o projeto.
    * `AsciiDecorator.java`: Responsável por formatação e decoração da saída de texto.
    * `Operacoes.java`: Contém a lógica das operações matemáticas (soma, subtração, etc.).
    * `Utils.java`: Agrupa outras funções utilitárias que podem ser usadas em diversos pontos do código.
* `Main.java`: Ponto de entrada da aplicação, onde a lógica principal é executada.

---
## Dependências (mínimas)

Para rodar o projeto, você precisa apenas de um **JDK (Java Development Kit)** instalado em sua máquina. Nenhuma biblioteca externa é necessária.

---
## Instalação

1.  Clone este repositório para o seu ambiente local:
    ```bash
    git clone [https://github.com/cdhnr/calculadoraBasica]
    ```
2.  Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```
3.  Compile o código-fonte:
    ```bash
    javac src/Main.java
    ```
4.  Execute a aplicação:
    ```bash
    java src.Main
    ```

---
## Boas Práticas (Comparativo entre Versões)

O código evoluiu significativamente, passando de uma estrutura monolítica para um design mais robusto.

| Código Original (Monolítico) | Código Atual (Modular) |
| :--- | :--- |
| Todas as funcionalidades (entrada de dados, lógica de operação, validação e saída) estão em uma única classe `calc`. | O projeto foi modularizado, com a lógica de negócio separada em classes específicas (`Operacoes`, `AsciiDecorator`, `Utils`), promovendo o princípio de **separação de responsabilidades**. |
| A lógica da calculadora está misturada com a interface do usuário. | O `Main.java` agora atua como orquestrador, chamando as classes utilitárias para realizar as tarefas, o que o torna mais limpo e legível. |
| O código é repetitivo e mais difícil de manter. Por exemplo, a validação de `if/else if/else` é longa. | A modularização facilita a manutenção e a adição de novas funcionalidades. Adicionar uma nova operação, por exemplo, não afeta a classe `Main`. |
| A validação de divisão por zero é feita em um `if` aninhado dentro da lógica de execução. | Uma classe de utilidades dedicada (`Utils`) poderia ser usada para gerenciar validações, tornando o código mais consistente e reutilizável. |

---
## Problemas Comuns

* **Problema de Compilação:** Certifique-se de que a variável de ambiente `JAVA_HOME` está configurada corretamente e que você está usando um JDK compatível.
* **Erro ao Executar:** Verifique se você está executando a aplicação a partir do diretório-raiz do projeto (`java src.Main`). O comando `java` precisa encontrar o arquivo `.class` no caminho correto.

---
## Melhorias Futuras para Pensar

* **Cálculos com Múltiplos Números:** Refatorar a lógica para permitir que a calculadora receba e processe um número infinito de entradas para uma única operação (por exemplo, `soma(1, 2, 3, 4, 5)`), talvez utilizando **arrays** ou **listas** para armazenar os números.
* **Tratamento de Exceções:** Implementar um tratamento de exceções mais robusto para lidar com entradas de usuário inválidas (e.g., texto em vez de números).
* **Adição de Novas Operações:** Expandir a classe `Operacoes` para incluir mais funcionalidades, como potência, raiz quadrada, etc.
* **Testes Automatizados:** Escrever testes de unidade para garantir que as operações matemáticas funcionem como esperado, evitando regressões futuras.
* **Interface Gráfica (GUI):** Aprimorar a interface de usuário, migrando de uma aplicação de linha de comando para uma interface gráfica.