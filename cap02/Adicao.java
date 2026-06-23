// Programa de adição que insere dois números inteiros e exibe a soma deles.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Adicao {
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int numero1; // primeiro número a somar
        int numero2; // segundo número a somar
        int soma; // soma de numero1 e numero2

        System.out.print("Digite o primeiro inteiro: "); // prompt
        numero1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário

        System.out.print("Digite o segundo inteiro: "); // prompt
        numero2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

        soma = numero1 + numero2; // soma os números

        System.out.printf("A soma é: %d%n", soma); // exibe a soma
    } // fim do método main
} // fim da classe Adicao
