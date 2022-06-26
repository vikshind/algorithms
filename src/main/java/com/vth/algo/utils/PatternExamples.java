package com.vth.algo.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExamples {
    public static void main(String[] args) {
        String str = "9400088899";
        PatternExamples patternExamples = new PatternExamples();
        boolean isValid =  patternExamples.isValidMobileNumber(str);
        System.out.println(String.format("%s is valid? [y/n] => %b", str,  isValid));
    }

    private boolean isValidMobileNumber(String str) {
        Pattern phoneNumberPattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = phoneNumberPattern.matcher(str);
        //returns a boolean value
        return (match.find() && match.group().equals(str));
    }
}
