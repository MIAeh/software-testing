package com.company;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

import static org.junit.Assert.*;

/**
 * 自定义匹配器LessThanOrEqual
 * @override 覆写describeTo()及matches(Object o)
 * @Factory 外部测试类利用工具方法lessThanOrEuqal调用自定义匹配器
 * @param <T>
 */
public class LessThanOrEqual<T extends Comparable <T>> extends BaseMatcher<Comparable <T>>{
    private final Comparable<T> expectedValue;

    public LessThanOrEqual(T expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("less than or equal (<=)" + expectedValue);
    }

    @Override
    public boolean matches(Object t) {
        int compareTo = expectedValue.compareTo((T) t);
        return compareTo > -1;
    }

    @Factory
    public static<T extends  Comparable<T>> Matcher<T> lessThanOrEqual(T t) {
        return new LessThanOrEqual(t);
    }
}