package es.rutenioh.rulemachine;

import es.rutenioh.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzRuleMachine implements RuleMachine {

    private List<Rule> rules = new ArrayList<>();

    public String generateValue(int i) {

        StringBuilder valor = new StringBuilder();

        for (Rule rule: rules) {
            if (rule.check(i)) {
                valor.append(rule.generateValue());
            }
        };

        // si no hay valor es que es un número normal
        if (valor.toString().isEmpty()) {
            valor.append(i);
        }


        return valor.toString();

    }

    public void add(Rule rule) {
        rules.add(rule);
    }
}
