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
 if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("hour, minute and/or second was out of range.");
        }

String.format("%02d:%02d:%02d", hour, minute, second);

"%02d") to display leading zeros for a value that doesn’t use all the character positions in the specified field
width.

private static void displayTime(String header, Time1 t) método que só pode ser usado por sua própria classe.

try
    {
        time.setTime(99, 99, 99);
    }
catch(IllegalArgumentException e)
    {
        System.out.printf("Exception: %s%n%n", e.getMessage());
    }









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
