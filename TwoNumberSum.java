package com.example.demo.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public int[] twoSum(int[] nums, int target) {

        /*
        source = "https://walkccc.me/LeetCode/problems/0001/"
        * */

        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (numToIndex.containsKey(target - nums[i]))
                return new int[] {numToIndex.get(target - nums[i]), i};
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("\\s");
        int[] nums = new int[str.length];
        String target = br.readLine();

        TwoNumberSum two = new TwoNumberSum();

        for (int i=0;i< str.length;i++){
            nums[i] = Integer.parseInt(str[i]);
        }

        int [] arr = two.twoSum(nums,Integer.parseInt(target));

        for (int i : arr){
            System.out.println(i);
        }
    }
}
