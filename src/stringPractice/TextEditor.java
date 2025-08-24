package stringPractice;

public class TextEditor{
}
 /*
 
Problem : Undo Functionality for Text Editor
Task:
Implement a simple text editor that supports:

append(String text): Add text to the end.

undo(): Remove the last appended text.

getText(): Return current text.

Requirements:

Use StringBuilder for the core implementation.

Why is StringBuilder preferred over String here?

Extend the problem to support thread-safe operations (switch to StringBuffer).

Key Concepts Explored:

Immutability: String vs. mutable StringBuilder/StringBuffer.

Performance: Cost of concatenation in loops.

Thread Safety: When to use StringBuffer (synchronized) vs. StringBuilder (non-synchronized).

Certainly! Here is a line-by-line explanation of the `TextEditor` class implementation:

1. `private StringBuilder text = new StringBuilder();`  
   - Creates a mutable sequence of characters to efficiently build and modify the text.

2. `private java.util.Stack<String> history = new java.util.Stack<>();`  
   - Initializes a stack to keep track of each appended string for undo operations.

3. `public void append(String str) {`  
   - Method to add new text to the editor.

4. `text.append(str);`  
   - Appends the given string to the end of the current text.

5. `history.push(str);`  
   - Stores the appended string in the stack for possible undo.

6. `}`  
   - Ends the `append` method.

7. `public void undo() {`  
   - Method to remove the last appended text.

8. `if (!history.isEmpty()) {`  
   - Checks if there is any text to undo.

9. `String last = history.pop();`  
   - Retrieves and removes the last appended string from the stack.

10. `text.delete(text.length() - last.length(), text.length());`  
    - Deletes the last appended string from the text.

11. `}`  
    - Ends the `if` block and the `undo` method.

12. `public String getText() {`  
    - Method to return the current text.

13. `return text.toString();`  
    - Converts the `StringBuilder` content to a `String` and returns it.

14. `}`  
    - Ends the `getText` method.

This structure allows efficient text editing and undo functionality.
  */
