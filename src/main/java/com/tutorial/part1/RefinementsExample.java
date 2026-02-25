package com.tutorial.part1;

import liquidjava.specification.Refinement;

@SuppressWarnings("unused")
public class RefinementsExample {

    void example1() {
        // @Refinement("positive > 0")
        int positive = -1;
    }

    void example2() {
        // @Refinement("nonzero != 0")
        int nonzero = 0;
    }

    void example3() {
        // @Refinement("0 <= _ && _ <= 100")
        int percentage = 200;
    }

    void example4() {
        // TODO: add refinement to ensure value is either -1 or 1
        int direction = 0;
    }
}
