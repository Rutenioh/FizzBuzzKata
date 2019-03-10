package es.rutenioh.rules;

public class FizzRule extends GenericRule implements Rule {

    private final String FIZZ = "Fizz";

    @Override
    public boolean check(int i) {
        return isDivisibleBy(i, 3) || containsNumber(i, "3");
    }

    @Override
    public String generateValue() {
        return FIZZ;
    }



}
