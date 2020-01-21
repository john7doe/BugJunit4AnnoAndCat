package com.john7doe.junitfilter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParaTest {
    @Parameterized.Parameters
    public static Collection<Integer> data() {
        return Arrays.asList(1,2,3);
    }

    private int fInput;


    public ParaTest(int input) {
        this.fInput = input;
    }

    @Test
    public void test() {
    }
}