# Design Linked List

## Approach

1. Create a `Node` class containing:
    - `val` to store the node's value.
    - `next` to store the reference to the next node.

2. Maintain two pointers, `head` and `tail`.
    - `head` points to the first node.
    - `tail` points to the last node.
    - Initially, both are `null`.

   `Node head;`
   `Node tail;`

3. For `get(index)`, start from `head` and traverse the linked list until reaching the required index.

   `Node temp = head;`

   If the index is invalid or the node does not exist, return `-1`.

4. For `addAtHead(val)`, create a new node and make it point to the current `head`.

   `newNode.next = head;`
   `head = newNode;`

   If the list is empty, both `head` and `tail` point to the new node.

5. For `addAtTail(val)`, connect the current `tail` to the new node and update `tail`.

   `tail.next = newNode;`
   `tail = newNode;`

6. For `addAtIndex(index, val)`, first handle index `0` using `addAtHead()`.

   `if (index == 0) {`
   `    addAtHead(val);`
   `    return;`
   `}`

   Then traverse to the node immediately before the target index.

   `for (int i = 0; i < index - 1; i++) {`
   `    temp = temp.next;`
   `}`

   Insert the new node by adjusting the links.

   `newNode.next = temp.next;`
   `temp.next = newNode;`

   If the new node is inserted at the end, update `tail`.

7. For `deleteAtIndex(index)`, handle deletion of the first node separately.

   `head = head.next;`

   If the list becomes empty, set `tail` to `null`.

8. For deleting a node at any other index, traverse to the node immediately before the target node.

   `for (int i = 0; i < index - 1; i++) {`
   `    temp = temp.next;`
   `}`

9. Skip the target node by connecting the previous node directly to the node after it.

   `temp.next = temp.next.next;`

10. If the deleted node was the last node, update `tail`.

    `if (temp.next == null) {`
    `    tail = temp;`
    `}`

11. For `display()`, start from `head` and traverse until `null`, printing each node's value.

    `while (temp != null) {`
    `    System.out.print(temp.val + " -> ");`
    `    temp = temp.next;`
    `}`

## Complexity

| Operation         | Time | Space |
| ----------------- | ---- | ----- |
| `get(index)`      | O(n) | O(1)  |
| `addAtHead()`     | O(1) | O(1)  |
| `addAtTail()`     | O(1) | O(1)  |
| `addAtIndex()`    | O(n) | O(1)  |
| `deleteAtIndex()` | O(n) | O(1)  |
| `display()`       | O(n) | O(1)  |

## Java Solution

See `DesignLL.java`.