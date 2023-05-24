package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.PriorityQueue;

@Slf4j
public class PriorityQueueExample {
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        log.info("head:"+queue.element());
        log.info("head:"+queue.peek());
        log.info("the queue elements:");
        for (String s : queue) {
            log.info("queue item value :{}", s);
        }
        queue.remove();
        queue.poll();
        log.info("after removing two elements:");
        for (String s : queue) {
            log.info("queue  item value :{}", s);
        }
    }
}
