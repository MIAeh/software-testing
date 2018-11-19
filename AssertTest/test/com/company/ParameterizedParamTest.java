package com.company;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;

/**
 * 参数化测试
 */
@RunWith(Parameterized.class)
public class ParameterizedParamTest {

        @Parameter(value = 0)
        public int number;

        @Parameter(value =  1)
        public int expectedResult;

        @Parameters(name = "{index}: factorial({0}) = {1}")
        public static Collection<Object[]> factorialData() {
            return Arrays.asList(new Object[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}});
        }

        @Test
        public void This_is_a_parameterized_test() throws Exception {
            Factorial f = new Factorial();
            Assert.assertEquals(f.factorial(number), expectedResult);
        }
}

