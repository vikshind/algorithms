package com.vth.algo.utils;

public class ItoA {

    public static void main(String[] args) {
        ItoA itoa = new ItoA();
        System.out.println(itoa.itoa(3421));
        System.out.println(itoa.itoa(-56783));
    }
    public String itoa (int num)
    {
        if (num == 0)
        {
            return "0";
        }
        boolean isNegative = false;
        if (num < 0)
        {
            isNegative = true;
            num = -num;
        }

        int digits = 0;
        int tmp = num;

        while (tmp > 0)
        {
            digits++;
            tmp /= 10;
        }

        int digs[] = new int[digits];

        for (tmp = digits-1; num > 0; tmp--)
        {
            digs[tmp] = num % 10;
            num /= 10;
        }

        StringBuilder stringBuilder = new StringBuilder((isNegative  ? "-" : ""));
        for (tmp = 0; tmp <= digits-1; tmp++)
        {
            stringBuilder.append((char)(digs[tmp] + 48));
        }
        return stringBuilder.toString();
    }
}
