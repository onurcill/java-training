package com.definex.training.datetime;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class DateTimeFormatterExample {
    public static void main(String[] args) {



        LocalDateTime myDateObj = LocalDateTime.now();
        log.info("Before formatting: " + myDateObj);
        String pattern1= "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern(pattern1);
        String formattedDate1 = myDateObj.format(myFormatObj1);
        log.info("After formattedDate1: " + formattedDate1);

        String pattern2= "dd-MMM-yyyy HH:mm:ss";
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern(pattern2);
        String formattedDate2 = myDateObj.format(myFormatObj2);
        log.info("After formattedDate2: " + formattedDate2);

        String pattern3= "E, MMM dd yyyy HH:mm:ss";
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern(pattern3);
        String formattedDate3 = myDateObj.format(myFormatObj3);
        log.info("After formattedDate3: " + formattedDate3);
    }
}
