package es.rutenioh.rules;

public class BuzzRule extends GenericRule implements Rule {

    private final String BUZZ = "Buzz";

    @Override
    public boolean check(int i) {
        return isDivisibleBy(i, 5) || containsNumber(i, "5");
    }

    @Override
    public String generateValue() {
        return BUZZ;
    }
}
