package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;
import java.util.TreeSet;

@Slf4j
public class TreeSetExample {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        TreeSet<String> set=new TreeSet<>();
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
