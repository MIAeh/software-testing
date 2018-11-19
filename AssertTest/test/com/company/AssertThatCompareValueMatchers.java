package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class AssertThatCompareValueMatchers {
    @Test
    public void equalTo_Matcher() throws Exception {
        int age = 30;
        assertThat(age, equalTo(30));

        double salary = 5710.74;
        assertThat(salary, equalTo(5710.740));

        String lessonName = "Software testing";
        assertThat(lessonName, equalTo("Software testing"));

        int[] ages = {30, 35};
        assertThat(ages, equalTo(new int[] {30, 35}));

        String[] tools = {"JUnit", "PSD", "eclEmma"};
        assertThat(tools, equalTo(new String[] {"JUnit", "PSD", "eclEmma"}));
    }

    @Test
    public void equalTo_Matcher_array_content_same_but_index_not_same() throws Exception {
        String[] tools = {"Junit", "PSD", "eclEmma"};
        assertThat(tools, equalTo(new String[] {"PSD", "JUnit", "eclEmma"}));
    }

    @Test
    public void not_Matcher_test_pass() throws Exception {
        int age = 30;
        assertThat(age, not(equalTo(33)));
    }

    @Test
    public void not_Matcher_test_fail() throws Exception {
        int age = 30;
        assertThat(age, not(equalTo(30)));
    }
}