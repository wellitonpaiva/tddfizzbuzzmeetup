package com.thescientist;

import org.springframework.web.bind.annotation.*;

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

    String executeWithStar(String result, int number) {
        if("Fizz".equals(result)) {
            if (number % 2 == 0) {
                return "Star";
            }
        }
        return result;
    }
}
