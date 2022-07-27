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


}
