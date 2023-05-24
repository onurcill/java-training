package com.definex.training.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        log.info(myObj.toString()); // Display the current date
    }
}
