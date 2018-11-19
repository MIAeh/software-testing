package com.company;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;


//@FixMethodOrder(MethodSorters.DEFAULT)
@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTests {
    @Test
    public void edit() throws Exception {
        System.out.println("Edit executed");
    }

    @Test
    public void create() throws Exception {
        System.out.println("Create executed");
    }

    @Test
    public void remove() throws Exception {
        System.out.println("Remove executed");
    }
}