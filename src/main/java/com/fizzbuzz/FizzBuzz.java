package com.fizzbuzz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzz {

    public static String check_if_number_returns_string(int number){
        return number % 15 == 0 ? "FizzBuzz" : (number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : String.valueOf(number));
    }

    public static String check_regex(int number){
        String num = String.valueOf(number); 
        Pattern pattern = Pattern.compile(num);
        Matcher matcher = pattern.matcher(num);
        boolean matchFound = matcher.find("3");
        if(matchFound) {
            return "Fizz";
        } else {
            return num;
        }
    }
}
