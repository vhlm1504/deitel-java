# Markdown Cheat Sheet (Example File)

This is a **generic Markdown template** showcasing essential formatting features.

---

## 1. Headers
# H1 (Largest)
## H2
### H3
#### H4
##### H5
###### H6 (Smallest)

---
Arrays e ArrayLists
São objetos e possuem vários métodos de instância 
Declarando arrays
array de tipo primitivo, só primitivo não os wrappers
int[] c = new int[12]; cria um array de Array do tipo int. já são inicializados por default com 0
ou int[] c; na Stack pointer
c = new int[12]; na Heap
String[] b = new String[100], x = new String[27]; mas é uma boa prática escrever um array só por declaração
String[] b = new String[100];
String[] x = new String[27];
quando um array só é declarado as chaves podem estar do lado do pointer
String b[] = new String[100]; embora seja preferível da outra forma
inicialização com valores não defaults
int[] n = {10,20,30,40, 50};

final int ARRAY_LENGHT = 10; dentro do main
int[] array = new int[ARRAY_LENGHT];
array.lenght

números aleatórios
java.security.SecureRandom;
++frequency[1 + randomNumbers.nextInt(6)];


Exception handling
Uma exceção, exception, indica um problema que ocorreu durante a execução.
Sugere que o problema ocorre de forma não frequente e que a regra é executar corretamente
Exception handling ajuda a criar programas tolerantes a falha, resolvendo-as sozinho sem para a execução.
Quando um método ou a JVM detecta um problema, lança, throws, uma exceção.
try-catch
try usado para pegar as exceções lançadas. Basta envelopar num bloco try qualquer código que possa lançar uma exceção e então, usar 
um bloco catch para lidar com a exceção lançada.
para um try podemos ter vários blocos catch para diferentes tipos de exceções
toString é chamada implicitamente em catch para pegar a mensagem de erro e a grava no objeto da exceção.
uma vez que o erro é apresentado, display, a falha, fault é considerada handled e o programa continua para sua próxima declaração
depois do } de fechamendo do catch


A NullPointerException ocorre quando se tenta chamar um método numa referência null.


Enhanced for statement
for(parameter : arrayName)
    statement

parametro tem um tipo e um identificador, ex int number
arrayName é o array no qual se quer iterar.
o tipo do parâmetro tem que ser consistente com o tipo do array
“for each iteration, assign the next element of array to
int variable number, then execute the following statement.”
Então, em cada iterração o valor parâmetro assume um valor do array
for (int counter = 0; counter < array.length; counter++)
{
    total += array[counter];
}
equivale a 
for (int number : array)
    total += number;

o modo melhorado do for pode ser usado toda vez que o index do array não importar.

Passando Arrays para métodos
double[] hourlyTemperatures = new double[24];
modifyArray(hourlyTemperatures);
modifyElement(hourlyTemperatures[3]);

public static void modifyArray(double[] b)
public static void modigyEment(double element)
















## 2. Text Formatting
- **Bold** (`**text**` or `__text__`)
- *Italic* (`*text*` or `_text_`)
- ~~Strikethrough~~ (`~~text~~`)
- `Inline Code` (`` `code` ``)
- > Blockquote (prefix with `>`)

---

## 3. Lists
### Unordered List
- Item 1
- Item 2
  - Nested Item (indent with 2 spaces)

### Ordered List
1. First item
2. Second item
   1. Nested item (indent with 3 spaces)

### Task List
- [x] Completed task
- [ ] Pending task (`[ ]`)

---

## 4. Links
- [Hyperlink](https://example.com) (`[text](url)`)

---

## 5. Code Blocks
```java
# Syntax-highlighted block (java)
class HelloWorld {
    public static main(String... args) {
        System.out.println("Hello markdown");
    }
}
