package org.factoriaf5.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzbuzzLogicTest {
    private FizzbuzzLogic metodo;

    @BeforeEach
    public void init () {
        this.metodo = new FizzbuzzLogic();
    }

    @Test
    public void numeroToString () {
        assertEquals("4", metodo.FizzBuzz(4));
        assertEquals("1", metodo.FizzBuzz(1));
    }

    @Test
    public void fizzbuzz () {
        assertEquals("fizzbuzz", metodo.FizzBuzz(15));
        assertTrue(metodo.FizzBuzz(45) == "fizzbuzz");
        assertFalse(metodo.FizzBuzz(12) == "fizzbuzz");
        assertFalse(metodo.FizzBuzz(25) == "fizzbuzz");
    }

    @Test
    public void fizz () {
        assertEquals("fizz", metodo.FizzBuzz(12));
        assertTrue(metodo.FizzBuzz(3) == "fizz");
        assertFalse(metodo.FizzBuzz(14) == "fizz");
        assertFalse(metodo.FizzBuzz(9) == "buzz");
        assertInstanceOf(String.class, metodo.FizzBuzz(43));
    }

    @Test
    public void buzz () {
        assertEquals("buzz", metodo.FizzBuzz(20));
        assertTrue(metodo.FizzBuzz(5) == "buzz");
        assertTrue(metodo.FizzBuzz(56) == "buzz");
        assertFalse(metodo.FizzBuzz(13) == "buzz");
        assertFalse(metodo.FizzBuzz(10) == "fizz");
        assertInstanceOf(String.class, metodo.FizzBuzz(45));
    }
}