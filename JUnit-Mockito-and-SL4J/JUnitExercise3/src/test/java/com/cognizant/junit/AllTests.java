package com.cognizant.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorTest.class,
    StringUtilsTest.class
})
public class AllTests {
}