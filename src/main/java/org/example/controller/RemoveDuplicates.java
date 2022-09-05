package org.example.controller;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args){
        List<String> list1= Arrays.asList("Apple","Orange");
        List<String> list2= Arrays.asList("Apple","Orange","mango");
        List<List<String>> listData = new ArrayList<>();
        listData.add(list1);
        listData.add(list2);
        Set<String> items = new HashSet<>();
        List<String> str = listData.stream().flatMap(x->x.stream().filter(y->!items.add(y))).collect(Collectors.toList());
        System.out.println(str);
    }
}
