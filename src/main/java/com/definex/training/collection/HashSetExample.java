package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

@Slf4j
public class HashSetExample {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        HashSet<String> set=new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        for (String str : set) {
            log.info(str);
        }
    }
}
