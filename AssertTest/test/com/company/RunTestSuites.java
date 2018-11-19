package com.company;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AssertTest.class, OrderedTests.class, Assumption.class})
public class RunTestSuites {
}