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
  */
