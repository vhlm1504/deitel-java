
Polimorfismo permite programarmos em geral invés de específico.
Em particular, permite que escrevamos programs que processem objetos que compartilham a mesma superclasse. Diretamente ou indiretamente
como se todos os objetos fossem da superclasse.
A mesma mensagem, enviada a uma variedade de objetos tem muitas formas de resultados, por isso o termo polimorfismo.

Polimorfismo ocorre quando um programa invoca um método através de uma variável de superclasse durante a execução, runtime. A versão da subclasse do método é chamado baseado no tipo de referência armazenada na variável de superclasse
A program can create an array of superclass variables that refer to objects of many subclass types. This is allowed
because each subclass object is an object of its superclass

you cannot treat a superclass object as a subclass
object, because a superclass object is not an object of any of its subclasses.
The Java compiler does allow the assignment of a superclass reference to a subclass
variable if we explicitly cast the superclass reference to the subclass type.

quando uma variável de superclasse contém uma referência ao um objeto de subclasse, e essa referência é usada para invocar 
um método, a versão da subclasse do método que é chamado mas só depois do cast na referência para se tornar subclasse.


Classes abstratas e métodos
Abstract classes and methods
classes criadas sem a intenção de se criar objetos dela. Declaram atributos e comportamentos comuns, abstratos e concretos.
são usada apenas como superclasses em hierarquias de herança. são chamadas de abstract superclasses
Elas são incompletas de propósito e por isso não podem ter objetos instanciados. As partes faltandes devem ser completados pelas subclasses, essas sim serão classes instanciáveis e são chamadas concretas.
Também é possível ter subclasses abstratas, incompletas e não instanciáveis.
Superclasses abstradas são muito generalizadas para que seja possível criar objetos, elas especificam apenas o que é comum entre as subclasses.

Not all hierarchies contain abstract classes. However, you’ll often write client code
that uses only abstract superclass types to reduce the client code’s dependencies on a range
of subclass types. For example, you can write a method with a parameter of an abstract
superclass type. When called, such a method can receive an object of any concrete class that
directly or indirectly extends the superclass specified as the parameter’s type.


Shape superclasse abstrata
TwoDimensionalShape                ThreeDimensionalShape  subclasses abstratas
Circle, Square, Triangle           Sphere, Cube, Tetrahedron    classes concretas

Normalmente uma classe abstrata tem um ou mais métodos abstratos
public abstract void draw(); //métodos abstratos não proveem sua implementação
a subclasse concreta é que tem a obrigação de prover a implementação dos métodos abstract
Constructors and static methods cannot be declared abstract
Construtores não são herdados, então um construtor abstract nunca poderia ser implementado.
Embora métodos não-private static são herdados, eles não podem ser sobrescritos. Então, já que métodos abstratos são feitos para serem sobrescritos para que processem objetos do seu próprio tipo, não faz sentido declarar static métodos abstratod.

Although we cannot instantiate objects of abstract superclasses, you’ll soon see that we can
use abstract superclasses to declare variables that can hold references to objects of any concrete
class derived from those abstract superclasses. We’ll use such variables to manipulate
subclass objects polymorphically. You also can use abstract superclass names to invoke
static methods declared in those abstract superclasses.

Polimorfismo é particularmente efetivo para implementação do chamado layered software systems.

Em sistemas operacionais, cada tipo de equipamento físico pode operar bem diferente de outros. Mesmo assim comandos para ler e escrever dados
tem certa uniformidade. Para cada equipamento, o sistema operacional usa um pedaço de software chamado device driver para 
controlar toda comunicação entre o sistema e o equipamento.
A mensagem enviada ao objeto device-driver precisa ser interpretada especificamente no contexto do driver e como ele manipula
especificamente aquele aparelho.
Em sistemas operacionais orientados a objeto podem fazer uso de superclasses abstratas para prover uma interface apropriada para todos os device drivers.
Então, através de herança da superclasse abstrata, subclasses são formadas de forma que todas se comportem similarmente.
Os métodos device-driver são declarados abstract na abstract superclass
Novos equipamentos estão sempre sendo lançados então cada método é implementado na subclasse concreta que impletará o device driver do novo equipamento
Este é um dos exemplos de como polimorfismo, polymorphism, faz sistemas extensíveis, extensible.

abstract superclass Employee declara a interface da hierarquia, o conjunto de métodos que o programa pode invocar em 
todas os objetos Employee
Interface aqui significa, em general sense, as várias formas que programas podem se comunicar com objetos de qualquer subclasse Employee
Não confundir o sentido geral aqui usado para uma "interface" com a noção de uma Java interface.

métodos get não são overridden, não podem ser sobrescritos em nenhuma subclasse.
Cada um desses métodos get é herdado e usado "as is" por cada subclasse.

@Override
    public double earnings()
    {
        return 0.0; //enquanto estiver incompleta para que não trave a execução de testes
        //throw new UnsupportedOperationException();//caso deseje que o compilador aceite a execução mas que pare caso em alguma linha se tente chamar a função inacabada.
    }

instanceof é um operador

Métodos final, final method, em uma superclasse não poderá ser sobrescrito, override, nas suas subclasses. Então sua implementação será a mesma em todas as subclasses.O nome disso é static binding.
Métodos declarados private são implicitamente finals.
Métodos que são declarados static também são implicitamente finals.

Final Classes
Uma final class não ser uma superclasse. Não pode ser extended para criar uma subclasse.
Todos seus métodos são implicitamente finals.
Class String é um exemplo.
Fazer a classe final também previne que programadores criem subclasses que possam bypass security restrictions.
Como boa prática, tudo que pode ser final, deve ser final. Além da segurança, o compilador consegue aplicar otimizações quando algo é final.

Problema em chamar métodos a partir de construtores.
Não chame métodos overridable a partir de construtores. Isso pode levar a uma chamada de métodos overridden da subclasse, antes da completa inicialização do objeto.

É perfeitamente aceitável invocar métodos static nos construtores. Até recomendado para evitar-se repetir validações nos casos de métodos set.

Criando e usando INTERFACES
Interfaces definem e padronizam a maneira na qual coisas como pessoas e sistemas podem interagir entre si.
Objetos de software se comunicam por meio de interfaces.
Java interface descreve um conjunto de métodos.
Uma interface contém apenas membros contantes e abstrados.
Diferente de classes, todas as interfaces pricisam ser públicas e não podem especificar qualquer detalhe de implementação como declarações de métodos concretose variáveis de instância.
Todos os métodos são declarados implicitamente public abstract e todos os campos são implicitamente declarados public static final.

Para usar uma interface, uma classe concreta precisa especificar que implements a interface e precisa declarar cada método na interface
com a assinatura específica da declaração da interface.
Uma classe que não consegue implementar todos os métodos da interface é uma classe abstrata e precisa ser declarada como abstrata.

Interfaces são comumente usadas para compartilhar métodos e ctes entre classes de tipos diparate, disparate types. Classes que não se relacionam pela hierarquia de classes.
Permite que objetos de classes não relacionadas possam ser processadas polymorphically.
objetos de classes que implementam a mesma interface podem responder às mesmas chamadas de método.
Cria-se interfaces que descrevem a funcionalidade requerida e depois implementa-se a interface em qualquer classe que requeira aquela funcionalidade.

interface Payable
implementar em qualquer classe que precise calcular um pagamento, Employee, Invoice....

Interfaces vs Abstract Class
Quando não há uma implementação default para ser herdada, nenhum campo ou implementação de métodos default, interfaces com frequência substituem uma abstract class.


Uma classe por extends, herdar, apenas uma classe, mas pode implementar, implements, várias interfaces
public class ClassName extends SuperclassName implements FirstInterface, SecondInterface, …

Invoice implements Payable, so an Invoice object also is a Payable
object, and we can assign the reference of an Invoice object to a Payable variable.
When a class implements an interface, the same is-a relationship provided by inheritance
applies. Class Employee implements Payable, so we can say that an Employee is a
Payable. In fact, objects of any classes that extend Employee are also Payable objects.


Algumas interfaces comuns na Java API
Comparable: vários operadores de comparação entre valores primitivos. Não pode ser usada para comparar objetos
Serializable: usada para identificar classes nas quais objetos podem escrever ou ler de algum tipo de armazenagem.files, streams 
Runnable: implementada por uma classe que tenha uma tarefa a fazer.
GUI event-listener interfaces: 
AutoCloseable:










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
