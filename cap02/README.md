# Capítulo 2: Introdução a Aplicativos Java; Entrada/Saída e Operadores 📝

Este capítulo apresenta os conceitos básicos de programação em Java, incluindo a estrutura de uma classe, a exibição de dados no console, a entrada de dados usando a classe `Scanner`, e o uso de operadores aritméticos e de comparação.

---

## 🔑 Conceitos Chave

1. **Estrutura de Classe Básica**:
   Tudo em Java está dentro de uma classe. A classe principal que executa o programa deve conter o método `main`:
   ```java
   public class NomeDaClasse {
       public static void main(String[] args) {
           // Instruções
       }
   }
   ```

2. **Exibição de Texto**:
   - `System.out.print("Texto");` -> Exibe texto sem pular linha.
   - `System.out.println("Texto");` -> Exibe texto e pula para a próxima linha.
   - `System.out.printf("Soma: %d%n", soma);` -> Exibe texto formatado. O `%n` é o caractere de quebra de linha portátil (independente de OS).

3. **Entrada de Dados (Classe `Scanner`)**:
   Para ler dados do teclado, importamos e usamos `java.util.Scanner`:
   ```java
   import java.util.Scanner; // Importa a classe Scanner

   Scanner input = new Scanner(System.in); // Cria o scanner
   int numero = input.nextInt(); // Lê um inteiro
   ```

4. **Operadores Aritméticos**:
   - Adição (`+`), Subtração (`-`), Multiplicação (`*`), Divisão (`/`), Resto/Módulo (`%`).

5. **Operadores de Comparação**:
   - Igualdade (`==`), Diferença (`!=`), Maior que (`>`), Menor que (`<`), Maior ou igual (`>=`), Menor ou igual (`<=`).

---

## 🚀 Exercícios Iniciais Sugeridos

Aqui estão alguns exemplos clássicos deste capítulo para começarmos:
1. `BemVindo1.java` - Apenas exibe uma linha de texto.
2. `Adicao.java` - Solicita dois inteiros ao usuário, faz a soma e exibe o resultado.

Vamos começar escrevendo seu primeiro programa!
