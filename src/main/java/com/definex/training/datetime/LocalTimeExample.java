package com.definex.training.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalTime;

@Slf4j
public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        log.info(myObj.toString()); // Display the current date
    }
}
