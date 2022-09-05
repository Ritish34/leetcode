package com.example.demo.leetcode;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numberOfChildren = g.length;
        int numberOfCookies = s.length;
        int cookie = 0, answer = 0;
        for(int i=0;i<numberOfChildren && cookie<numberOfCookies;){
            if(s[cookie] >= g[i]){
                i++;
               // answer++;
                answer++;
            }
          //  cookie++;
            cookie++;
        }
        return answer;
    }

    public static void main (String[] args)
    {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        System.out.println(findContentChildren(g, s));
    }
}
