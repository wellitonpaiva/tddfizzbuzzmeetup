package com.thescientist;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void whenSixThenStar() {
        assertThat(fizzBuzz.executeWithStar(6), is("Star"));
    }


}