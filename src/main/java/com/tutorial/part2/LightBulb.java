package com.tutorial.part2;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

@StateSet({"on", "off"})
public class LightBulb {

    @StateRefinement(to="off()")
    public LightBulb() {}

    @StateRefinement(from="off()", to="on()")
    public void turnOn() {}

    @StateRefinement(from="on()", to="off()")
    public void turnOff() {}

    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.turnOn();
        bulb.turnOff();
        // bulb.turnOff(); // uncomment for error
    }
}
