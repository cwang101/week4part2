package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="Fizz";
        String result=game.getReport(13);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_Fizz_when_divisible_by_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="Fizz";
        String result=game.getReport(6);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_Buzz_when_divisible_by_5() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="Buzz";
        String result=game.getReport(10);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_Whizz_when_divisible_by_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="Whizz";
        String result=game.getReport(14);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_FizzBuzz_when_divisible_by_3_and_5() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="FizzBuzz";
        String result=game.getReport(15);
        assertThat(result, equalTo(expectedResult));
    }

    @Test
    public void should_return_FizzWhizz_when_divisible_by_3_and_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="FizzWhizz";
        String result=game.getReport(21);
        assertThat(result, equalTo(expectedResult));
    }
    @Test
    public void should_return_BuzzWhizz_when_divisible_by_5_and_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="BuzzWhizz";
        String result=game.getReport(70);
        assertThat(result, equalTo(expectedResult));
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_divisible_by_3_and_5_and_7() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="FizzBuzzWhizz";
        String result=game.getReport(105);
        assertThat(result, equalTo(expectedResult));
    }
    @Test
    public void should_return_origin_when_not_divisible_by_any() {
        FizzBuzzGame game = new FizzBuzzGame();
        String expectedResult="4";
        String result=game.getReport(4);
        assertThat(result, equalTo(expectedResult));
    }
}
