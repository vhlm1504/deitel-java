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
métodos declarados dentro do bloco da classe test, podem ser chamados diretamente, pelo identificador. 
    se o método for static.
já os declarados fora do corpo da classe, precisam ser chamados usando-se o nome da classe primeiro. duas maneiras
    métodos declarados em outras classes não públicas no memso arquivo
    public class Executavel{
        public static void main(String[] args)
        {
            Ajudante util = new Ajudante();
            util.mensagem();
        }
    }
    
    class Ajudante()
    {
        public void mensgem(){
            System.out.println("olá de fora");
        }
    }
    métodos de outros arquivos
        mesma lógica, precisa instanciar para depois chamar os métodos métodos de instância ou usar o nome da classe NomeClasse.método() se for método static

métodos static pertencem à classe. é carregado uma única vez no início da execução e não precisa de new para ser executado. deve ser acessado pelo nome da classe
métodos de instância pertencem ao objeto que precisam do new para passarem a existir. São acessáveis pelo objeto.

Avaliação curto circuito de condições complexas
    expressões com && e || são avaliadas apenas até que se saiba se a condição é verdadeira ou falsa. Então, deve-se pôr 
    como primeiros testes os mais fáceis de ser false
    
Operadores Boolean Logical AND & e boolean logical inclusive OR |
    & e | são identicos aos operadores && e || exceto que eles sempre avaliam ambos os seus operandos. Eles não fazem avaliação curto circuito
    isso é útil quando quando o operador da direita requer um efeito colateral, a modificação di valor de uma variável 
    ex.: (birthday == true) | (++age >= 65)
    mas isso para casos raros, é boa prática evitar expressões com efeitos colaterais
Boolean logical exclusive OR ^
    é true só se um, e só um, de seus operandos for true. também não tem curto circuito
    true e true = false
    true e false = true
    false e true = true
    false e false = false

Regras para programação estruturada
    1. comece com o diagrama de atividade simples. action state
    2. qualquer action state pode ser substituido por dois action states em sequência.
    3. qualquer action state pode ser substituido por qualquer declaração de controle(sequência de action states, if, if...else,
switch, while, do...while or for).
    4. Regras 2 e 3 podem ser aplicadas quão frequentemente se queira e em qualquer ordem.
    





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
