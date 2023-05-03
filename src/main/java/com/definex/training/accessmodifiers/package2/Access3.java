package com.definex.training.accessmodifiers.package2;

import com.definex.training.accessmodifiers.package1.Access1;

public class Access3 {
    public static void main(String[] args) {
        Access1 a1 = new Access1();
        System.out.println(a1.hours);
        System.out.println(a1.minutes);
    }
}
