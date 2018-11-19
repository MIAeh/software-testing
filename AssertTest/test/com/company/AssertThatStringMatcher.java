package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * 利用assertThat测试String匹配器
 * endsWith
 * startsWith
 * containsString
 */
public class AssertThatStringMatcher {
    @Test
    public void verify_Strings() throws Exception {
        String name = "Mia Xu";
        assertThat(name, startsWith("Mia"));
        assertThat(name, endsWith("u"));
        assertThat(name, containsString("ia X"));
    }
}