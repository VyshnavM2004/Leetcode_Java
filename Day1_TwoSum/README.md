# 1. Two Sum

**Difficulty:** Easy

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution, and you may not use the same element twice.

## Original Problem

https://leetcode.com/problems/two-sum/

## Approach

1. Traverse the array.
2. For every element, compute the required complement.
3. Search the remaining elements for the complement.
4. Return the indices when a match is found.

## Complexity

| Complexity | Value |
|------------|-------|
| Time | O(n²) |
| Space | O(1) |

## Java Solution

See `Main.java`.