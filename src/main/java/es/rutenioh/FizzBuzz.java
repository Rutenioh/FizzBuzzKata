package es.rutenioh;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;

    public String print(int i) {

        StringBuilder cadena = new StringBuilder();

        if (isFizz(i)) {
            cadena.append(FIZZ);
        }
        if (isBuzz(i)) {
            cadena.append(BUZZ);
        }
        if (!isFizz(i) && !isBuzz(i)) {
            cadena.append(i);
        }

        return cadena.toString();

    }

    private boolean isBuzz(int i) {
        return isDivisibleBy(i, 5) || containsNumber(i, "5");
    }

    private boolean containsNumber(int i, String numeroContenido) {
        return String.valueOf(i).contains(numeroContenido);
    }

    private boolean isFizz(int i) {
        return isDivisibleBy(i, 3) || containsNumber(i, "3");
    }

    private boolean isDivisibleBy(int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }
}
