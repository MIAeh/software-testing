package com.company;

//import静态方法必须使用static
import static com.company.LessThanOrEqual.lessThanOrEqual;
import static org.junit.Assert.*;
import org.junit.Test;
import static  org.junit.Assert.assertThat;

/**
 * 利用自定义匹配器LessThanOrEqual进行测试
 */
public class AssertThatBuildInMatchers {
    @Test
    public void lessThanOrEquals_custom_matcher() throws Exception {
        int actualAge = 42;
        assertThat(actualAge, lessThanOrEqual(45));
        assertThat(actualAge, lessThanOrEqual(42));

        double actualPI = 3.14;
        assertThat(actualPI, lessThanOrEqual(3.1415));
        assertThat(actualPI, lessThanOrEqual(3.14));

        String actualName = "Mia";
        assertThat(actualName, lessThanOrEqual("Xu"));
        assertThat(actualName, lessThanOrEqual("Mia"));
    }

    @Test
    public void compare_with_Maximum_Value() throws Exception {
        int actualMax = Integer.MAX_VALUE + 1;
        assertThat(actualMax, lessThanOrEqual(Integer.MAX_VALUE));
    }

    @Test
    public void compare_with_Minimal_Value() throws Exception {
        int actualMin = Integer.MIN_VALUE + 1;
        assertThat(actualMin, lessThanOrEqual(Integer.MIN_VALUE));
    }

}