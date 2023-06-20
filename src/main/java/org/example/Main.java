package org.example;

import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();//class object "TestClass"
        Exercise1 exercise1 = new Exercise1();//class object "Exercise1"
        System.out.println(testClass.summ(10,10));
        System.out.println(testClass.division(15,16, 5));
        System.out.println(exercise1.result(0));
    }
}