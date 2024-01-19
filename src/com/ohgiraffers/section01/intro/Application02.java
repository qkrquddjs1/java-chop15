package com.ohgiraffers.section01.intro;

public class Application02 {
    public static void main(String[] args) {
        /* 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다. */

        OuterCalculator.sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println(sum.sumTwoNumber(20, 10));
        System.out.println(minus.minusTwoNumber(20, 10));
        System.out.println(multiple.multipleTwoNumber(20, 10));
        System.out.println(divide.divideTwoNumber(20, 10));




    }
}
