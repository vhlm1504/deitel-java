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
Módulos de programas em Java
    Se escreve novos programas combinando novos métodos e classes com métodos e classe prédefinidos na diponibilizados na 
Java Application Programming Interface - Java API ou Java class library.
    Classes que se relacionam são, normalmente, agrupadas em pacotes, packages. Assim, podem ser importadas em novos programas e reusadas
    The Java API provides a rich collection of predefined classes that contain methods for performing common mathematical
calculations, string manipulations, character manipulations, input/output operations, database operations, networking operations, 
file processing, error checking and more.

static Methods, static Fields and Class Math
    a maioria dos métodos são chamados em objetos específicos. Métodos de instância, pertencem ao objeto.
    static method ou class method. pertencem a classe e são chamados pelo nome da classe diretamente.
    é comum e conveniente para classes manterem métodos static para realizarem tarefas comuns.
    só precisamos importar a classe 
    variáveis static de instância, cada objeto da classe compartilha o mesma mesma variável static. Variáveis de classe. 
    todo objeto criado vai compartilhar a mesma única cópia dessas variáveis
    variáveis de instância e variáveis de classe, juntas, são chamadas de fields, campos.

public final static cte. public permite que você use a cte nas suas mesmas classes. final indica que é cte. static permite que seja 
acessível pelo nome da classe. Se o atributo for ser usado apenas na sua classe, declara-se private.

Porque o método main é declarado static: para que a jvm possa invocar o método main sem precisar de um objeto da clases, que realmente não vai existir ainda.

Method-Call Stack and Stack Frames
    stack, pilha. pushin and popping. LIFO
    quando um programa chama um método, o método chamado precisa saber como retornar ao seu chamador. então o endereço de retorno
empurrado, pushed, na pilha de chamada de métodos, method-call stack. A pilha de chamada de métodos também contém memória para as 
variáveis locais, inlcuindo os parâmetros do método. Essa memória é chamada stack frame ou activation record do método chamado e é uma 
porção do method-call stack guardado. 
    stack overflow erro que ocorre quando há mais chamadas de métodos do que memória disponível.

página 212 pacotes importantes em java

Java não permite a comparação entre tipos primitivos e valores enum.

shadowing: se uma variável local ou parâmetro em um médoto tem o mesmo nome do que o campo na classe, o campo é escondto até que o 
bloco termine sua execução.

method overload



    
    
    




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
