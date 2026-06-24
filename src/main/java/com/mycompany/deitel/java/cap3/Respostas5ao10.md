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
3.5 (Keyword new) What’s the purpose of keyword new? Explain what happens when you use it.
criar novos objetos. 
MinhaClasse objeto = new MinhaClasse();
ocorre a reserva de memória Heap para armazenar os dados desse novo objeto
o contrutor é chamado para garantir a configuração inicial do objeto
ocorre a criação da referência, a variável objeto que recebe o endereço de memória do objeto criado para que seja acessável
ex.: Gato meuGato = new Gato("Edi", 10);
meuGato é o controle remoto(referência) e o gato real, Edi de 10 anos, foi criado e vive no endereço de memória guardado em meuGato
O objeto fica guardado na Heap
O endereço na Stack

3.6 (Default Constructors) What is a default constructor? How are an object’s instance variables
initialized if a class has only a default constructor?
O construtor inicializa as variáveis de instância validando os argumento de inicialização passados.
Caso um construtor não tenha sido declarado, Java inicializa as variáveis de instância com valores padrões.
Tipos primitivos não inicializados com 0 ou 0.0. Exceto boolean, que é inicializado com false.
Tipos de referência são inicializados com null.

3.7 (Instance Variables) Explain the purpose of an instance variable.
São os atributos de uma classe. Classes tem atributos e métodos, comportamentos. Os atibutos de instância são próprios 
do objeto instanciado, uma cópia própria do objeto de cada atributo.
Existem desde o início da execução.
Garantem que cada objeto seja independente das outras instâncias.

3.8 (Using Classes without Importing Them) Most classes need to be imported before they can
be used in an app. Why is every app allowed to use classes System and String without first importing
them?
Porque fazem parte da java.lang, pacote já integrado por padrão no Java. 

3.9 (Using a Class without Importing It) Explain how a program could use class Scanner without
importing it.
Neste caso seria necessário usar toda a definição, java.util.Scanner por exemplo 

3.10 (set and get Methods) Explain why a class might provide a set method and a get method for
an instance variable.
exitem para garantir a proteção das variáveis de instância. métodos set validam os argumentos passados para garantir 
a consistência lógica e métodos get retornam variáveis talvez depois de tratamento ou validação

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
