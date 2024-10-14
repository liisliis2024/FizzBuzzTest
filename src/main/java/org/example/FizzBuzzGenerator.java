package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {
    public static void main(String[] args) {

        int count = 15;
        List<String> fizzBuzzLoop = getFizzBuzzLoop(count);
        System.out.println(fizzBuzzLoop);
    }


    public static List<String> getFizzBuzzLoop(int count) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i < count + 1; i++) {

            result.add(fizzBuzzOf(i));
        }
        return result;
    }

    public static String fizzBuzzOf(int i) {
        String line = "";

        if (i % 3 == 0) {
            line += "Fizz";
        }
        if (i % 5 == 0) {
            line += "Buzz";
        }
        if (line.isEmpty()) {
            line += Integer.toString(i);
        }
        return line;
    }
}
