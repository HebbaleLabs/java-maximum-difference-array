package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

@RunWith(Parameterized.class)
public class MaximumDifferenceArrayTest {
    Integer[] input;
    int expectedValue;


    public MaximumDifferenceArrayTest(Integer[] input, int expectedValue) throws FileNotFoundException {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() throws IOException {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 2, 3, 4, 5, 6}, 5},
                {new Integer[]{-2, 3, 4, 5, 6, 7}, 9},
                {new Integer[]{-2, -3, -4, -5, -6}, 4},
                {new Integer[]{109, 208, 407, 809, 345, 123}, 700},
                {new Integer[]{0, 0, 0, 0, 0, 0}, 0},
                {new Integer[]{3, 3, 3, 3, 3, 3, 3, 3}, 0},
                {new Integer[]{1, 0, 2, 2, 4, 0, 1, 5, 2, 1, 6, 1, 5, 6, 11, 23, 24}, 24},
                {new Integer[]{1, 1, 1, 1, 1, 11, 1, 0}, 11},
                {new Integer[]{0, 1, 3, 2, 3, 4, 4, 5, -8}, 13},
                {new Integer[]{}, -1},
                {new Integer[]{45}, -1}
        });
    }

    @Test
    public void checkMaximumDifference() {
        Assert.assertEquals("input:" + Arrays.toString(input), expectedValue, MaximumDifferenceArray.findMaxDifference(input));
    }
}
