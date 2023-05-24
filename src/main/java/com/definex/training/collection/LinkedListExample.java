package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
@Slf4j
public class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        for (String s : al) {
            log.info("LinkedList item value :{}", s);
        }
    }
}