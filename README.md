PALINDROME APP

UC1 : Application Entry & Welcome Message

Overview: Display a welcome banner with the application name and version when the program starts. This verifies the Java entry point and console I/O. Learning Goals

Class as a container for app logic. public static void main(String[] args) entry point. static method invocation by JVM. Console output with System.out.println. Startup flow before actual palindrome logic.

Prerequisites:

Java 17+ (or Java 8+ if that’s your baseline) A terminal

UC2 — Print a Hardcoded Palindrome Result Overview Check a hardcoded word (e.g., "madam") and print whether it is a palindrome. Learning Goals

Use of String and string literals. Simple conditional logic (if-else). Equality check with equals.

UC3: Palindrome Check Using String Reverse

Goal: Check palindrome by reversing the string manually.

Flow:

Iterate through string using a loop. Build reversed string. Compare reversed string with original. Print result.

Key Concepts:

for Loop String Immutability String Concatenation (+)

UC4: Character Array-Based Palindrome Check

Goal : Check palindrome using a character array and two-pointer technique.

Flow : Convert string into char[].

Use two pointers: Start pointer End pointer Compare characters until middle.

Key Concepts: char[] Array Array Indexing Two Pointer Technique Efficient comparison

Data Structure: char[]

Sample Output : Input: radar Result: Palindrome

UC5: Stack-Based Palindrome Checker

Goal:

Use a Stack data structure to reverse characters and validate whether a string is a palindrome.

Actor: User

Flow:

1.User provides a string.

2.Each character of the string is pushed onto a stack.

3.Characters are popped from the stack to generate the reversed string.

4.The reversed string is compared with the original string.

5.If both match, the string is a palindrome.

Key Concepts:

1.Stack – A linear data structure that follows the Last In First Out (LIFO) principle.

2.Push Operation – Inserts characters into the stack.

3.Pop Operation – Removes characters in reverse order.

4.Reversal Logic – Stack naturally reverses elements, making it useful for palindrome validation.

Data Structure: Stack

UC6: Queue + Stack Based Palindrome Check

Goal:

Demonstrate FIFO vs LIFO behavior using Queue and Stack to validate palindrome logic.

Actor: User

Flow:

1.Input string is taken.

2.Characters are enqueued into a Queue.

3.Characters are pushed into a Stack.

4.Characters are dequeued from the Queue and popped from the Stack.

5.If both values match at every step, the string is a palindrome.

Key Concepts:

1.Queue – Follows First In First Out (FIFO) principle.

2.Stack – Follows Last In First Out (LIFO) principle.

3.Enqueue Operation – Adds elements to the queue.

4.Dequeue Operation – Removes elements from the queue.

5.Comparison Logic – Compare queue output with stack output.

Data Structures: Queue, Stack

UC7: Deque-Based Optimized Palindrome Checker

Goal:

Use a Deque (Double Ended Queue) to compare characters from both ends of the string efficiently.

Actor: User

Flow:

1.Insert characters into a Deque.

2.Compare front and rear characters.

3.Remove them if they match.

4.Continue until the deque becomes empty or mismatch occurs.

Key Concepts:

1.Deque (Double Ended Queue) – Allows insertion and deletion from both ends.

2.Front Access – Retrieves first element.

3.Rear Access – Retrieves last element.

4.Optimized Comparison – Avoids creating extra structures.

Data Structure: Deque

UC8: Linked List-Based Palindrome Checker

Goal:

Check whether a string is a palindrome using a Singly Linked List.

Actor: User

Flow:

1.Convert string characters into nodes of a linked list.

2.Use fast and slow pointers to find the middle.

3.Reverse the second half of the list.

4.Compare both halves of the list.

Key Concepts:

1.Singly Linked List – Nodes connected through references.

2.Node Traversal – Access elements sequentially.

3.Fast and Slow Pointer Technique – Efficient way to find middle node.

4.In-place Reversal – Reverse nodes without extra memory.

Data Structure: Singly Linked List

UC9: Recursive Palindrome Checker

Goal: Validate a palindrome using recursion.

Actor: User

Flow:

1.Compare first and last characters.

2.Recursively call the function for the remaining substring.

3.Stop when base condition is reached.

Key Concepts:

1.Recursion – A function calling itself.

2.Base Condition – Stops recursive calls.

UC10: Case-Insensitive & Space-Ignored Palindrome

Goal:

Check palindrome ignoring spaces and letter case.

Actor: User

Flow:

1.Normalize the string.

2.Remove spaces.

3.Convert characters to lowercase.

4.Apply palindrome validation logic.

Key Concepts:

1.String Preprocessing

2.Regular Expressions

3.Normalization

UC11: Object-Oriented Palindrome Service

Goal: Encapsulate palindrome logic inside a dedicated class.

Actor: User

Flow:

1.Create PalindromeChecker class.

2.Implement checkPalindrome() method.

3.Main method calls the service class.

Key Concepts (OOP):

1.Encapsulation – Bundle logic inside a class.

2.Single Responsibility Principle

3.Modular Code Design

UC12: Strategy Pattern for Palindrome Algorithms

Goal: Use Strategy Pattern to dynamically choose a palindrome algorithm.

Actor: User

Flow:

1.Define PalindromeStrategy interface.

2.Implement different strategies:

a.StackStrategy

b.DequeStrategy

3.Select the strategy at runtime.

Key Concepts:

1.Interface

2.Polymorphism

3.Strategy Design Pattern

4.Loose Coupling

UC13: Performance Comparison

Goal: Compare the execution time of different palindrome algorithms.

Actor: User

Flow:

1.Run multiple algorithms.

2.Measure execution time using System.nanoTime().

3.Display results.

Key Concepts:

1.Performance Benchmarking

2.System.nanoTime()

3.Algorithm Efficiency Comparison
