package com.fizzbuzz;

public class FizzBuzz {

    public static String check_if_number_returns_string(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }else{
            return number % 3 == 0 ? "Fizz" : number % 5 == 0 ? "Buzz" : String.valueOf(number);
        }
    }
}
