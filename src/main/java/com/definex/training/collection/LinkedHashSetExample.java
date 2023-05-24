package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;

@Slf4j
public class LinkedHashSetExample {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<>();
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
