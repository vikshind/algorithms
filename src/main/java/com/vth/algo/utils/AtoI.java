package com.vth.algo.utils;

public class AtoI {
    public int atoi(String str){
        int result = 0;
        for (int i = 0; i<str.length(); i++){
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        AtoI myAtoI = new AtoI();
        System.out.println(myAtoI.atoi("3456"));
    }
}
