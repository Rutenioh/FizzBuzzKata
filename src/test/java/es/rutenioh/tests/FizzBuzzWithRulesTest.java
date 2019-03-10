package es.rutenioh.tests;

import es.rutenioh.FizzBuzz;
import es.rutenioh.FizzBuzzWithRules;
import es.rutenioh.rulemachine.FizzBuzzRuleMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWithRulesTest {


    private FizzBuzzWithRules sut;

    @BeforeEach
    void setUp() {
        sut = new FizzBuzzWithRules(new FizzBuzzRuleMachine());
    }


    @Test
    public void deberiaDevolverFizzSiEsDividibleEntreTres() {
        String valor = sut.print(3);

        assertEquals("Fizz", valor);


    }

    @Test
    public void deberiaDevolverBuzzSiEsDividibleEntreCinco() {
        String valor = sut.print(5);
        assertEquals("Buzz", valor);
    }

    @Test
    public void deberiaDevolverFizzBuzzSiEsDividibleEntreTresYCinco() {
        String valor = sut.print(15);
        assertEquals("FizzBuzz", valor);
    }

    @Test
    public void deberiaDevolverElNumeroSiNoEsDivisibleNiPorTresNiPorCinco() {
        String valor = sut.print(2);
        assertEquals("2", valor);
    }

    @Test
    public void deberiaDevolverFizzSiTieneUnTres() {
        String valor = sut.print(13);
        assertEquals("Fizz", valor);
    }

    @Test
    public void deberiaDevolverBuzzSiTieneUnCinco() {
        String valor = sut.print(25);
        assertEquals("Buzz", valor);
    }


    @Test
    void pintarTodaLaSerieFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <=100; i++) {
            System.out.print(fizzBuzz.print(i) +" ");
        }
    }


}
