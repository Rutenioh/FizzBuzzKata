package es.rutenioh.tests;

import es.rutenioh.FizzBuzz;
import es.rutenioh.FizzBuzzWithRules;
import es.rutenioh.rulemachine.FizzBuzzRuleMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzModeCompatorTest {

    private static FizzBuzz sut;
    private static FizzBuzzWithRules sutWithRules;

    @BeforeEach
    void setUp() {
        sut = new FizzBuzz();
        sutWithRules = new FizzBuzzWithRules(new FizzBuzzRuleMachine());
    }

    @Test
    void deberiaDevolverLoMismoEnAmbosModos() {
        StringBuilder fizzBuzz = new StringBuilder();
        for (int i = 1; i <=100; i++) {
            fizzBuzz.append(sut.print(i) +" ");
        }

        StringBuilder fizzBuzzWithRules = new StringBuilder();
        for (int i = 1; i <=100; i++) {
            fizzBuzzWithRules.append(sutWithRules.print(i) +" ");
        }

        assertEquals(fizzBuzz.toString(), fizzBuzzWithRules.toString());
    }


}
