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


Multdimensional Arrays
int[][] b = {{1, 2}, {3, 4}};
int[][] b = new int[3][5];

Um array com multiplas linhas e número de colunas diferentes pode ser criado assim também:
int[][] b = new int[2][];
b[0] = new int[5];
b[1] = new int[3];
int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
public static void outputArray(int[][] array)
{
    for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }

}

array.length determines the number of
rows in the array. In the inner for statement, the expression array[row].length determines
the number of columns in the current row of the array


Variable-lenght argument lists
ellipsis (...) 
... nos parâmetros do método.
indica que o método recebe um número variável de argumentos daquele tipo em particular
o uso de ellipsis só pode ocorrer uma vez numa lista de parâmetros.
melhor do que usar vários métodos com sobrecarga


Usando command-line arguments
usando os parâmetros do método main


Classe Array
sort
binarySearch
equals comparar arrays
fill por valores dentro de um array
arraycopy
Arrays.sort(doubleArray);
Arrays.fill(filledIntArray, 7);
System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
boolean b = Arrays.equals(intArray, intArrayCopy);
location = Arrays.binarySearch(intArray, 8763);
parallelSort can sort large arrays more efficiently on multicore
systems.

ArrayList<Sring> list;
Java API provê várias estruturas de dados predefinidas, chamadas coleções, collections. Usadas para guardar grupos de objetos relacionados
na memória.
ArrayList<T> é uma classe de coleção do pacote java.util
T é uma convenção para guardar lugar para o tipo quando declarando new ArrayList
ArrayList<String> list; só objetos String
ArrayList<Integer> integers; só objetos int
Como se trata de uma classe genérica, classes que podem ser usadas com qualquer tipo de dados não primitivos, 
só podem ser de tipos não primitivos, por isso é necessário usar os wrappers
métodos comuns da classe ArrayList<T>
add
remove
clear
contains
get
indexOf
remove
size
trimToSize
Notação diamante <>. Diamond notation for creating an object of a generic class

ArrayList<String> items = new ArrayList<String>();
ArrayList<String> items = new ArrayList<>(); diamond (<>) notation faz com que o compilador descubra sozinho que tipo de objeto
a classe genérica vai usar, neste caso, String.











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
