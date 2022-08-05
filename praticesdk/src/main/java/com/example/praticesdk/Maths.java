package com.example.praticesdk;

public class Maths {
        public static int appIntegers(int... args) {
            int result = 0;
            if (args.length > 0) {
                for (int arg : args) {
                    result += arg;
                }
            }
            return result;
        }

    public static int add(int... args) {
        int result = 0;
        if (args.length > 0) {
            for (int arg : args) {
                result += arg;
            }
        }
        return result;
    }


    public static int subtract(int a,int b) {
        int result = 0;
        result=a-b;
        return result;
    }

    public static double multiply(double num1,double num2) {
        double result = 0;
        result = num1 * num2;
        return result;
    }

    public static double doDiv(double num1,double num2) {
            double result = 0;
            result = num1 / (num2 * 1.0);
            return result;
    }

    public static double doMod(double num1,double num2) {
        double result = 0;
        result = num1 % num2;
        return result;

    }

    public static double doPow(double num1,double num2) {
            double sum = Math.pow(num1, num2);
            return sum;
    }


}
