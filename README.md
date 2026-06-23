# Jornada Java: Como Programar ☕🚀

Bem-vindo à sua pasta de estudos de **Java**! Após dominar os conceitos fundamentais, controle de fluxo e gerenciamento manual de memória em **C**, você está pronto para dar o próximo passo rumo ao topo 1% dos programadores, entrando no mundo da **Programação Orientada a Objetos (POO)** com **Java**.

---

## 🔍 C vs. Java: O que muda?

Como você já tem uma base sólida em C, aqui estão as principais transições conceituais que você fará:

| Característica | Em C 💻 | Em Java ☕ |
| :--- | :--- | :--- |
| **Paradigma** | Estruturado / Procedural | Orientado a Objetos (Tudo pertence a uma classe) |
| **Gerenciamento de Memória** | Manual (`malloc`, `free`, ponteiros) | Automático (Garbage Collector) |
| **Compilação e Execução** | Compila diretamente para código de máquina nativo | Compila para *bytecode* (`.class`), executado pela JVM |
| **Ponteiros** | Explícitos, com aritmética de ponteiros | Referências implícitas e seguras (sem aritmética de ponteiros) |
| **Segurança e Robustez** | Permite acesso direto à memória (potencial para Buffer Overflow) | Fortemente tipado, com verificações em tempo de execução |

---

## 🛠️ Como Compilar e Executar no Windows (Java 26)

Você possui o **Java 26** instalado e configurado no seu PATH! Veja as duas formas de rodar seus códigos:

### Método 1: Execução Direta (Para arquivos simples de um único arquivo)
Desde o Java 11, você pode executar um arquivo `.java` diretamente sem gerar o arquivo `.class` compilado. Isso é ótimo para testes rápidos:
```powershell
java NomeDoPrograma.java
```

### Método 2: Compilação Tradicional (Recomendado para múltiplos arquivos/classes)
1. **Compilar** o código fonte em bytecode:
   ```powershell
   javac NomeDoPrograma.java
   ```
   *Isso gerará um arquivo `NomeDoPrograma.class` na mesma pasta.*

2. **Executar** o bytecode compilado na JVM:
   ```powershell
   java NomeDoPrograma
   ```
   *(Nota: não adicione a extensão `.class` ou `.java` ao rodar o comando `java` neste método).*

---

## 📂 Estrutura de Pastas Sugerida

Para manter a organização semelhante ao seu estudo de C, usaremos a seguinte estrutura:

```text
deitel-java/
│
├── README.md               <- Este guia de estudos
│
├── cap02/                  <- Introdução às Aplicações Java; Entrada/Saída e Operadores
│   ├── BemVindo1.java      <- Exemplo básico de exibição de texto
│   ├── Adicao.java         <- Exemplo com Scanner e operadores aritméticos
│   └── README.md           <- Guia específico do capítulo
│
├── cap03/                  <- Introdução a Classes, Objetos, Métodos e Strings
│   └── ...
│
└── cap04/                  <- Instruções de Controle: Parte 1
    └── ...
```

---

## 📝 Regras de Ouro em Java

1. **Nome do Arquivo e da Classe**: O nome do arquivo **deve coincidir exatamente** com o nome da classe pública declarada nele.
   - Se o arquivo for `MinhaClasse.java`, a classe dentro dele deve ser:
     ```java
     public class MinhaClasse {
         // ...
     }
     ```
2. **Nomenclatura (Convenções)**:
   - **Classes**: `CamelCase` com a primeira letra maiúscula (ex: `CalculadoraFrequencia`).
   - **Métodos e Variáveis**: `camelCase` com a primeira letra minúscula (ex: `calcularMedia()`, `totalPontos`).
   - **Constantes**: `MAIUSCULAS_COM_UNDERLINE` (ex: `PI`, `VALOR_MAXIMO`).
3. **Ponto de Entrada**: Todo programa Java executável precisa ter o método `main`:
   ```java
   public static void main(String[] args) {
       // Seu código começa aqui
   }
   ```

---

## 🤝 Como Vamos Trabalhar Juntos?

Assim como fizemos em C:
1. **Crie a pasta do capítulo** (ex: `cap02`) e adicione os códigos de exercícios.
2. **Peça ajuda** quando encontrar erros de compilação ou precisar entender conceitos como:
   - Encapsulamento (`private`, `public`, `protected`)
   - Construtores
   - Herança e Polimorfismo
   - Tratamento de Exceções
   - Estruturas de Dados em Java (Collections API)
3. **Feedback de Código**: Revisarei seu código para garantir boas práticas modernas do Java, uso correto de tipos e design orientado a objetos.

---

*“O único modo de aprender uma nova linguagem de programação é escrevendo programas nela.”* - Dennis Ritchie
