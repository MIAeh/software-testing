package com.company;

/**
 * 递归阶乘
 */
public class Factorial {
    public long factorial(long number) {
        if(number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
