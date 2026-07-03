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
Herança
Inheritance
Uma nova classe é criada adquirindo membros de uma classe existente 
A classe existe será a superclasse, superclass, da nova classe que será a subclasse da existente.
Uma subclasse pode se tornar uma superclasse para outra nova classe sendo criada.
Uma subclasse pode acrescer novos atributos, campos, e métodos o que leva alguns a chamarem herança de 
especialização.
superclasse direta, é a que a subclasse herda diretamente. A superclasse indireta é a que a superclasse 
herda indiretamente, a que a superclasse usa como sua própria superclasse na hierarquia da classe

A hierarquia das classes começa em java.lang.Object, todas as classes em java desceende diretamente ou indiretamente
dela.
extends ou herda de, inherits from.
Java suporta herança única apenas. single inheritance. Cada classe é derivada exatamente de uma outra classe
C++ permite herança de várias classes. Em java se usa interface .

is-a relationship representa herança. Um objeto de uma subclasse também pode ser tratada como um objeto
de seus superclasse. ex.: um carro é um veículo.
has-a relationship representa composição. Um objeto contem referência de membros de outro objeto

Uma subclasse pode customizar métodos herdados, para fazer isso usamos o overrides(redefine)

protected members
um modificador de acesso como public e private
um membro public de uma classe é acessível onde quer que seja que o a classe tenha uma referêcia a um objeto seu
ou uma de suas subclasses.
um membro private é acessível apenas dentro da classe em si.
protected níevel intermediário de acesso entre public e private. Um membro protected de uma superclasse pode 
ser acessado por membros desta superclasse por membros de suas subclasses e por membros de outras classes dentro
do mesmo pacote.
membros private não são acessíveis por subclasses, ficam escondidos em sua própria classe só sendo acessíveis
pelos métodos set e get

super
quando fizremos um override num membro herdado de uma superclasse, e quisermos agora usar o membro original
basta usar o super. para se referenciar ao membro herdade original.

contains a first name, last name, social security number, gross sales amount, commission
rate and base salary. Class BasePlusCommissionEmployee’s public services include
a BasePlusCommissionEmployee constructor (lines 15–42) and methods earnings
(lines 111–114) and toString (lines 117–126). Lines 45–108 declare public get and set
methods for the class’s private instance variables (declared in lines 7–12) firstName,
lastName, socialSecurityNumber, grossSales, commissionRate and baseSalary.
These variables and methods encapsulate all the necessary features of a base-salaried commission
employee.

toda classe extend a partir da classe Object, nem precisa escrver já vem implícito.

superclass constructor call syntax. super(...); dentro do contrutor da subclasse e precisa ser a primeira declaração do construtor


















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
