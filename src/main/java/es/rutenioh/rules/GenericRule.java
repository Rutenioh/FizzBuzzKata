package es.rutenioh.rules;

public class GenericRule {

    protected boolean containsNumber(int i, String numeroContenido) {
        return String.valueOf(i).contains(numeroContenido);
    }

    protected boolean isDivisibleBy(int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }
}
