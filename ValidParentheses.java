package com.example.demo.leetcode;

import java.util.Scanner;
import java.util.Stack;

/*
* 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
*
Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

*/

/*
* RunTime = 3ms
* Space = 42.2 MB
* */

public class ValidParentheses {

    public boolean isValid(String s){
        if (s.length() % 2 == 1){
            return false;
        }
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        if (s.length() == 0 && s.isEmpty()){
            return false;
        }
        for (int i=0; i<s.length();i++){
            char temp = s.charAt(i);
            if (temp == '(' ){
                stack.push((char)temp+1);
            } else if (temp =='{' || temp == '[') {
                stack.push((char)temp+2);
            }
            else if (!stack.empty() && stack.peek().equals((int)temp)){
                stack.pop();
            }
            else {
                flag = false;
                break;
            }
        }
        if (stack.empty() && flag){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ValidParentheses obj = new ValidParentheses();

        if (obj.isValid(str))
            System.out.println("String is Valid");
        else
            System.out.println("String is Not Valid");
    }
}

/*
* Source = "https://blog.devgenius.io/leetcode-20-valid-parentheses-c63972c6f50b"
*
* Time = 3 ms
* space = 41.8 MB
*
* Code ==>
*
* class Solution {
    public boolean isValid(String s) {
        // Stack to one by one character
        Stack<Character> stackOb = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                stackOb.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !stackOb.isEmpty() && stackOb.peek() == '(') {
                stackOb.pop();
            } else if (c == '}' && !stackOb.isEmpty() && stackOb.peek() == '{') {
                stackOb.pop();
            } else if (c == ']' && !stackOb.isEmpty() && stackOb.peek() == '[') {
                stackOb.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return stackOb.isEmpty();
    }
}
*
*
* */

/*
* Source = "https://levelup.gitconnected.com/valid-parentheses-python-8374c1612821"
*
* Time = 2ms
* Space = 42.1 MB
*
* Code ==>
*
* class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1){
            return false;
        }
         Stack<Character> stackOb = new Stack<>();
        // Loop for each character of the string
        for (char c : s.toCharArray()) {
            // If left symbol is encountered
            if (c == '(' || c == '{' || c == '[') {
                stackOb.push(c);
            }
            // If right symbol is encountered
            else if (c == ')' && !stackOb.isEmpty() && stackOb.peek() == '(') {
                stackOb.pop();
            } else if (c == '}' && !stackOb.isEmpty() && stackOb.peek() == '{') {
                stackOb.pop();
            } else if (c == ']' && !stackOb.isEmpty() && stackOb.peek() == '[') {
                stackOb.pop();
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return stackOb.isEmpty();
    }
}
* */
