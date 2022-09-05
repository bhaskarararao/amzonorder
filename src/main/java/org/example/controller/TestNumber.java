package org.example.controller;

import java.util.HashSet;
import java.util.Set;

public class TestNumber {
    public static void main(String[] args){
        int[] num ={1,2,3,4,5};
         int target = 6;
         Set<Integer> set = new HashSet<>();
         for(int i = 0; i < num.length; i++) {
            int required = target - num[i];
            if(set.contains(required)) {
                System.out.println( "required elements  " +required + ", " +num[i]);
            } else {
                set.add(num[i]);
            }
         }
    }
}
