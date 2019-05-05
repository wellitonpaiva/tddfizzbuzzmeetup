package com.thescientist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class FizzBuzz {

    @RequestMapping(value = "/fizzbuzz/{number}", method = RequestMethod.GET)
    public @ResponseBody String execute(@PathVariable int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    String executeWithStar(int number) {
        return "Star";
    }
}
