stack trace
includes the name of the exception (java.lang.ArithmeticException) in a descriptive
message that indicates the problem that occurred and the method-call stack (i.e., the call
chain) at the time it occurred. The stack trace includes the path of execution that led to
the exception method by method.

Java does allow division by zero with floating-point values.Such a calculation results in the value positive or negative infinity,
If 0.0 is divided by 0.0,the result is NaN (not a number), which is also represented in Java as a floating-point value
(but displays as NaN). If you need to compare a floating-point value to NaN, use the method
isNaN of class Float (for float values) or of class Double (for double values).

The top row of the callchain indicates the throw point—the initial point at which the exception occurred.

 public static int quotient(int numerator, int denominator) throws ArithmeticException
    {
        return numerator / denominator;
    }

catch block or a finally block

System.err (standard error stream) object

Mult-catch é possível e comum.
    catch(Type1 | Type2 | Type3 e)

Java uses a “multithreaded” model of program execution—each thread is a concurrent activity. One program can have many threads.
If a program has multiple threads, an uncaught exception will terminate only the thread in which the exception occurred.
In such programs, however, certain threads may rely on others, and if one thread terminates due to an uncaught exception, there may be adverse effects on the rest of the program.

After the exception is handled, program control does not return to the throw point, because the try block has expired (and its local variables have been lost). Rather, control
resumes after the last catch block. This is known as the termination model of exception handling.
Some languages use the resumption model of exception handling, in which, after an exception is handled, control resumes just after the throw point.

Using the throws Clause
This clause, which must appear after the method’s parameter list and before the body, contains a comma-separated
list of the exception types.

Exception handling is designed to process synchronous errors, which occur when a statement executes.
Exception handling is not designed to process problems associated with asynchronous events (e.g., disk I/O completions, network message arrivals, mouse clicks and keystrokes), which
occur in parallel with, and independent of, the program’s flow of control.

Java Exception Hierarchy
todas as classes de exceção do Java herdam, direta ou indiretamente, a classe Exception formando uma hierarquia de herança.
podemos extender essa hierarquia com nossas próprias classes de exceção.
Throwable é a superclasse de Exception. Apenas Theowable objects podem ser usados com exception-handling.
A classe Throwable tem duas subclasses diretas: Exception e Error
A Exception e suas subclasses representam situações excepcionais que podem ocorrer num programa e que podem ser pegar por esse programa.
A Error e suas sublcasses representam situações anormais que acontecem na JVM, a maioria acontece de forma não frequente e não deveria ser pegas naturalmente pela aplicação. Normalmente não são erros que a aplicação possa se recuperar.

Checked vs. Unchecked Exceptions
Java compiler impõe requerimentos especiais para exceções checked. Se checked ou unchecked é determinado pelo tipo da exceção

RuntimeExceptions são unchecked exceptions
são tipicamente causados por defeitos no código do programa.
    ArrayIndexOutOfBoundsExceptions, ArithmeticExceptions ...
Checked exceptions, todas as classes herdadas de Exception mas não diretamente ou indiretamente da classe RuntimeException.
Tais exceções sao tipicamente causadas por condições que não estão sob o controle do programa. Processamento de arquivos, o programa não consegue abrir um arquivo por exemplo.

Se a exceção for checked o compilador verifica se o método throws uma exception. O compilador reclama se a exceção do throws do método não for tratado num catch

Only the First Matching catch Executes
Apenas o primeiro catch é executado. No momento que uma exceção bate com um catch, para por ali, não continua a processar os outros.

finally Block
para evitar resource leak. O mais frequente resource leak em C e C++ é o momory leak
Memory no longer used by programs, files, database connections and network connections that are not closed
properly after they’re no longer needed might not be available for use in other programs
este bloco é posto após um catch, se não há um bloco catch, o finally pode vir logo após um bloco try.
When the finally Block Executes: will execute whether or not an exception is thrown in the corresponding try block,
also will execute if a try block exits by using a return, break or continue statement or simply by reaching its closing right brace.
The one case in which the finally block will not execute is if the application exits early from a try block
by calling method System.exit. This method, which we demonstrate in Chapter 15, immediately terminates an application.

resource-release code.

When an exception is thrown but not caught in a particular scope, the method-call stack is
“unwound,” and an attempt is made to catch the exception in the next outer try block. This process is called stack unwinding.


Assertions
condições que deveriam ser verdadeiras num ponto em particular num método, assertions.
usadas para debugging e na implementação mesmo.
assert expression; se falsa, lança uma exception
assert expression1 : expression2; se expression1 for falsa, joga a exception declrada na expression2.
úteis para implementar preconditions e postconditions
You use assertions primarily for debugging and identifying logic errors in an application.
You must explicitly enable assertions when executing a program, because they reduce performance and are unnecessary for the program’s user
java -ea AssertTest
Usuários não devem encontrar erros de assert. Por este motivo não devemos catch AssertionErrors, deixe o program terminar mesmo para que você possa ver a mensagem de erro
Não se deve usar assert para indicar problemas de runtime no código de produção.





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
