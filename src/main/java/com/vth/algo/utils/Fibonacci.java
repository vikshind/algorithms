package com.vth.algo.utils;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number of elements you want to see : ");
        int number = (new Scanner(System.in)).nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.print(number));
    }
    String print(int number){
        StringBuilder result = new StringBuilder();
        if(number <= 0){
            System.out.println("Invalid input, please enter +ve number");
            return "";
        }
        if(number == 1){
            result.append("0 ");
        }
        else{
            result.append("0 1 ");
        }
        int a = 0, b = 1;
        for (int i = 2; i < number; i++) {
            int next = a + b;
            result.append(next).append(" ");
            a = b;
            b = next;
        }
        return result.toString().trim();
    }
}
