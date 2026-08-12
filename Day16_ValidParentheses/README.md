# 20. Valid Parentheses

## Approach

1. Initialize a stack to store opening brackets.

   ```java
   Stack<Character> s = new Stack<>();
   ```

2. Traverse the string character by character.

   ```java
   for(int i = 0; i < str.length(); i++){
       char ch = str.charAt(i);
   }
   ```

3. If the character is an opening bracket `(`, `{`, or `[`, push it into the stack.

   ```java
   if(ch == '(' || ch == '{' || ch == '['){
       s.push(ch);
   }
   ```

4. If the character is a closing bracket, first check whether the stack is empty. If it is empty, there is no corresponding opening bracket, so return `false`.

   ```java
   if(s.isEmpty()){
       return false;
   }
   ```

5. Check whether the top opening bracket matches the current closing bracket.

   ```java
   if((s.peek() == '(' && ch == ')') ||
      (s.peek() == '{' && ch == '}') ||
      (s.peek() == '[' && ch == ']')){
       s.pop();
   }else{
       return false;
   }
   ```

6. After processing the entire string, the stack should be empty. If it is empty, every opening bracket had a matching closing bracket.

   ```java
   return s.isEmpty();
   ```

> **Important:** We use a **stack** because brackets must be matched in **LIFO (Last In, First Out)** order. The most recently opened bracket must be the first one to close.

### Example

For:

```text
{[()]}
```

The stack changes like this:

```text
{       → [{]
[       → [{, []
(       → [{, [, (]
)       → [{, []
]       → [{]
}       → []
```

Since the stack is empty at the end, the parentheses are valid.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(n)  |

## Java Solution

See `validParentheses.java`.
