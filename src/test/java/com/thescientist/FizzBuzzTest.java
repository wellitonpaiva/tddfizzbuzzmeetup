package com.thescientist;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void whenSixThenStar() {
        assertThat(fizzBuzz.executeWithStar("Fizz", 6), is("Star"));
    }

    @Test
    public void whenNineThenFizz() {
        assertThat(fizzBuzz.executeWithStar("Fizz", 9), is("Fizz"));
    }

    @Test
    public void whenOneThenReturnOne() {
        assertThat(fizzBuzz.executeWithStar("1", 1), is("1"));
    }

    @Test
    public void givenExecuteWhenSixThenStar() {
        assertThat(fizzBuzz.execute(6), is("Star"));
    }
}