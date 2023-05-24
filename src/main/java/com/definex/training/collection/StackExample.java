package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;
import java.util.Vector;

@Slf4j
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        log.info("Stack item value Before Pop");
        for (String s : stack) {
            log.info("Stack item value :{}", s);
        }
        stack.pop();
        log.info("Stack item value After Pop");
        for (String s : stack) {
            log.info("LinkedList item value :{}", s);
        }
    }
}