# 203. Remove Linked List Elements

## Approach

1. Create a dummy node and point it to the head of the linked list.

   ```java
   ListNode dummy = new ListNode(0);
   dummy.next = head;
   ```

2. Initialize two pointers:

    * `prev` pointing to the dummy node.
    * `curr` pointing to the head of the list.

3. Traverse the linked list until `curr` becomes `null`.

4. If the current node's value matches the given `val`, remove it by skipping the node.

   ```java
   prev.next = curr.next;
   ```

5. Otherwise, move the `prev` pointer forward.

   ```java
   prev = curr;
   ```

6. Move the `curr` pointer to the next node after each iteration.

   ```java
   curr = curr.next;
   ```

7. Return `dummy.next`, which points to the updated head of the linked list.

## Complexity

| Complexity | Value |
| ---------- | ----- |
| Time       | O(n)  |
| Space      | O(1)  |

## Java Solution

See `RemoveFromLL.java`.
