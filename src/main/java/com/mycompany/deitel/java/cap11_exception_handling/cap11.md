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
