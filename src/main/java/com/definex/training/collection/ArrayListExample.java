package com.definex.training.collection;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;

@Slf4j
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        for (String s : list) {
            log.info("Array list item value :{}", s);
        }
    }
}
