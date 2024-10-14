package org.example;

public class FizzBuzzGenerator {
    public static void main(String[] args) {

        int count = 15;

        for (int i = 1; i < count + 1; i++) {

            String line = fizzBuzzOf(i);
            System.out.println(line);

        }
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
