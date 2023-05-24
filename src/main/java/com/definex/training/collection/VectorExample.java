package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Vector;

@Slf4j
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        for (String s : v) {
            log.info("LinkedList item value :{}", s);
        }
    }
}