package es.rutenioh;

import es.rutenioh.rulemachine.RuleMachine;
import es.rutenioh.rules.BuzzRule;
import es.rutenioh.rules.FizzRule;

public class FizzBuzzWithRules {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private RuleMachine ruleMachine;


    public FizzBuzzWithRules (RuleMachine ruleMachine) {
        this.ruleMachine = ruleMachine;
        ruleMachine.add(new FizzRule());
        ruleMachine.add(new BuzzRule());
    }

    public String print(int i) {
        return ruleMachine.generateValue(i);
    }


}
