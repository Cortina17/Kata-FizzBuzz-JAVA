package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }

    @Test public void test_fizz(){
        assertEquals("Fizz", FizzBuzz.check_if_number_returns_string(3));
        assertEquals("Fizz", FizzBuzz.check_if_number_returns_string(6));
        assertEquals("Fizz", FizzBuzz.check_if_number_returns_string(9));
    }

    @Test public void test_buzz(){
        assertEquals("Buzz", FizzBuzz.check_if_number_returns_string(5));
        assertEquals("Buzz", FizzBuzz.check_if_number_returns_string(10));
        assertEquals("Buzz", FizzBuzz.check_if_number_returns_string(25));
    }

    @Test public void test_fizzbuzz(){
        assertEquals("FizzBuzz", FizzBuzz.check_if_number_returns_string(15));
        assertEquals("FizzBuzz", FizzBuzz.check_if_number_returns_string(15));
        assertEquals("FizzBuzz", FizzBuzz.check_if_number_returns_string(15));
    }

    @Test public void test_system_prints_number(){
        assertEquals("7", FizzBuzz.check_if_number_returns_string(7));
        assertEquals("22", FizzBuzz.check_if_number_returns_string(22));
        assertEquals("41", FizzBuzz.check_if_number_returns_string(41));
    }
}
