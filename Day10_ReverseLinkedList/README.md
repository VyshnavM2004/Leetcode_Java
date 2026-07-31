# 206. Reverse Linked List

## Approach

1. Initialize three pointers:

    * `prev = null`
    * `curr = head`
    * `next` to temporarily store the next node.
2. Traverse the linked list using a `while (curr != null)` loop.
3. Store the next node before changing the link:

   ```java
   next = curr.next;
   ```
4. Reverse the current node's pointer:

   ```java
   curr.next = prev;
   ```
5. Move the `prev` pointer one step forward:

   ```java
   prev = curr;
   ```
6. Move the `curr` pointer to the next node:

   ```java
   curr = next;
   ```
7. Continue until `curr` becomes `null`.
8. Return `prev`, which points to the new head of the reversed linked list.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

## Java Solution

See `RevLinkedList.java`.
