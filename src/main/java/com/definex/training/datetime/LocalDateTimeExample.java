package com.definex.training.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Slf4j
public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        log.info(myObj.toString()); // Display the current date
    }
}
