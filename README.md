# Calculadora Java com Swing

Este repositório contém o código de uma calculadora simples desenvolvida em Java utilizando a biblioteca Swing para criar a interface gráfica.

## Funcionalidades

A calculadora permite realizar as seguintes operações:

- Adição (`+`)
- Subtração (`-`)
- Multiplicação (`*`)
- Divisão (`÷`)
- Porcentagem (`%`)
- Limpar (botões `CE` e `C`)
- Apagar o último caractere (`<X`)

## Interface Gráfica

A interface foi criada utilizando `JFrame` para a janela principal e `JButton` para os botões de operação e números. A calculadora exibe um visor (`JTextField`) para mostrar os números e resultados.

## Como Executar

Para executar a calculadora, siga os passos abaixo:

1. Certifique-se de ter o JDK instalado em sua máquina.
2. Compile o arquivo `Main.java`:
    ```bash
    javac Main.java
    ```
3. Execute o programa:
    ```bash
    java Main
    ```

## Estrutura do Código

- O método `Calc()` é responsável por configurar a janela e os botões.
- O visor (`JTextField`) exibe o número digitado e o resultado.
- Os botões são organizados em um layout de grade (`GridLayout`) e possuem `ActionListeners` para definir o comportamento de cada operação.
- As operações suportadas incluem as básicas (adição, subtração, multiplicação, divisão) e uma função para porcentagem.

## Exemplo de Uso

Ao abrir a calculadora, você pode digitar números e escolher a operação desejada. Pressione o botão `=` para obter o resultado. Use os botões `CE` ou `C` para limpar o visor ou o botão `<X` para apagar o último caractere digitado.

## Dependências

Este projeto não depende de bibliotecas externas além do JDK.


