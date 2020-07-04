package com.leetcode.algorithm.easy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution_179 {

    public String largestNumber(int[] nums) {
        return IntStream.of(nums).mapToObj(String::valueOf).sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2)).collect(Collectors.joining());
    }

}