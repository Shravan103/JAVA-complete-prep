❤️ Java Memory Areas ❤️
Java memory has several parts, but here are the main ones relevant to variables and objects:
1. Stack Memory
2. Heap Memory
3. String Pool (part of heap — special case)

# 🔸 1️⃣. Stack Memory (stores primitive types and references)
● Every method call gets its own stack frame.
● Primitive variables like int, double, boolean are stored directly on the stack.
● References to objects (like String, Array, custom objects) are also stored here — but they only point to the actual object in the heap.

Example:
String a = "Java";
int x = 10;

● x (a primitive) → Stored directly on the stack.
● a (a reference to a String) → a is on the stack, but it points to "Java" in the String pool (heap).

# 🔸 2️⃣. Heap Memory (stores objects)
● Whenever you use new or create an object, it's stored in the heap.
● Objects like new String("Java"), arrays, or custom classes go here.
● Variables on the stack point to these objects.

Example:
String c = new String("Java");
● c (the reference) is on the stack
● The actual object "Java" created by new String() is in the heap

# 🔸 3️⃣. String Pool (special part of heap)
● This is where string literals are stored.
● Managed automatically to reuse strings with the same value.

Example: 
String s1 = "Hello";
String s2 = "Hello";

● Both point to the same "Hello" in the string pool.

# 🔹 Memory Layout Summary
|   Variable Type                   |   Memory Location   |   Example                       |
|   Primitive (int, double, etc.)   |   Stack             |   int a = 5;                    |
|   Object reference                |   Stack             |   MyClass obj = new MyClass();  |
|   Object itself                   |   Heap              |   Created with new              |
|   String literal                  |   String Pool       |   String s = "Hi";              |

# ✅ So, Where Are Variables Stored?
 → The variable (reference) is stored on the stack.
 → If it’s an object, the actual object is stored on the heap.
 → If it’s a primitive, it’s stored directly on the stack.
 → String literals go in the string pool (within heap).


# ✅ Stack:
+-------------------+---------------------+
| Variable Name     | Value / Reference   |
+-------------------+---------------------+
| x                 | 10                  |  <- primitive, value directly in stack
| name              | 0x1F2A              |  <- reference to "Java" in heap
+-------------------+---------------------+

Heap (or String Pool):
0x1F2A ---> "Java"
