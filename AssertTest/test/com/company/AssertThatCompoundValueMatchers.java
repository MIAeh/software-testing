package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.allOf;

public class AssertThatCompoundValueMatchers {
    @Test
    public void verify_multiple_values() throws Exception {
        double marks = 100.00;

        assertThat(marks, either(equalTo(100.00)).or(equalTo(90.9)));
        assertThat(marks, both(not(99.99)).and(not(60.00)));
        assertThat(marks, anyOf(equalTo(100.00), equalTo(1.00),
                equalTo(55.00), equalTo(88.00), equalTo(67.8)));
        assertThat(marks, not(anyOf(equalTo(0.00), equalTo(200.00))));
        assertThat(marks, not(allOf(equalTo(1.00), equalTo(100.00), equalTo(30.00))));
    }
}