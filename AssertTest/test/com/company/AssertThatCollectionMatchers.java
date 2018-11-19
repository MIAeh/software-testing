package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.hasItems;

public class AssertThatCollectionMatchers {
    @Test
    public void verify_collection_values() throws Exception {
        List<Double> salary = Arrays.asList(50.00, 200.0, 500.0);

        assertThat(salary, hasItem(50.00));
        assertThat(salary, hasItems(50.00, 200.00));
        assertThat(salary, not(hasItem(1.00)));
    }
}