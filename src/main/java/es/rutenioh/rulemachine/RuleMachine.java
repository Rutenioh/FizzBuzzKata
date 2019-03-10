package es.rutenioh.rulemachine;

import es.rutenioh.rules.Rule;

public interface RuleMachine {
    public String generateValue(int i);
    public void add(Rule rule);

}
