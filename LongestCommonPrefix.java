package com.example.demo.leetcode;

/*
* 14. Longest Common Prefix
Easy

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().replaceAll("\\s+$","").split(" ");

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String result = obj.longestCommonPrefix(input);

        System.out.println(result);
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = null;

        if (strs.length == 1){
            return strs[0];
        }
        else{
            result = new StringBuilder(strs[0]);
            for (int i=1;i< strs.length;i++){
                result = findPrefix(result.toString(),strs[i]);
            }
        }
        return result.toString();
    }
    static StringBuilder findPrefix(String a,String b){
        if (a.equals("") && a.equals("")){
            return new StringBuilder("");
        }
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<a.length() && i<b.length();i++){
            if(a.charAt(i) == b.charAt(i)){
                sb.append(a.charAt(i));
            }
            else {
                break;
            }
        }
        return sb;
    }
}
