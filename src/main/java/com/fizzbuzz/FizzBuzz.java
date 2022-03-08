package com.fizzbuzz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzz {

    public static String check_if_number_returns_string(int number){
        return number % 15 == 0 ? "FizzBuzz" : (number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : String.valueOf(number));
    }

    public static String check_regex_3(int number){
        String num = String.valueOf(number); 
        Pattern patternThree = Pattern.compile("3");
        Matcher matcherThree = patternThree.matcher(num);
        boolean matchFound = matcherThree.find();
        if(matchFound) {
            return "Fizz";
        } else {
            return num;
        }
    }

    public static String check_regex_5(int number){
        String num = String.valueOf(number); 
        Pattern patternFive = Pattern.compile("5");
        Matcher matcherFive = patternFive.matcher(num);
        boolean matchFound = matcherFive.find();
        if(matchFound) {
            return "Buzz";
        } else {
            return num;
        }
    }
}
