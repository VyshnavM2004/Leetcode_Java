# 160. Intersection of Two Linked Lists

## Approach

1. Initialize two pointers, `a` and `b`, pointing to the heads of the two linked lists.

   ```java
   ListNode a = headA;
   ListNode b = headB;
   ```

2. Traverse both linked lists separately to find their lengths.

   ```java
   while(a != null){
       lenA++;
       a = a.next;
   }

   while(b != null){
       lenB++;
       b = b.next;
   }
   ```

3. Reset both pointers back to the beginning of their respective linked lists.

   ```java
   a = headA;
   b = headB;
   ```

4. If one linked list is longer than the other, move its pointer forward until both pointers have the same number of nodes remaining.

   ```java
   while(lenA > lenB){
       a = a.next;
       lenA--;
   }

   while(lenB > lenA){
       b = b.next;
       lenB--;
   }
   ```

5. Now both pointers are at the same distance from the end of their respective lists.

6. Traverse both lists simultaneously. If they point to the same node, that node is the intersection.

   ```java
   while(a != b){
       a = a.next;
       b = b.next;
   }
   ```

7. Return `a`. If there is no intersection, both pointers eventually become `null`, so `null` is returned.

   ```java
   return a;
   ```

> **Important:** We compare `a != b`, not `a.val != b.val`, because an intersection means both pointers must refer to the **same node**, not just nodes containing the same value.

## Complexity

| Complexity | Value    |
| ---------- | -------- |
| Time       | O(n + m) |
| Space      | O(1)     |

## Java Solution

See `IntersectionOfTwoLinkedList.java`.
