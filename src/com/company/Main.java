package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(compilation('T', 5));

    }
    private static char charValue(int number) {
        char charValue = (char)(number + 64);
        return charValue;
    }

    private static int numericalValue(char letter) {
        return letter - 64;
    }

    private static int rule1(int numericalValue) {
        return numericalValue *2;

    }

    private static int rule2(int numericalValue) {
        return (numericalValue % 3) * 5;
    }

    private static int rule3(int numericalValue) {
        return (numericalValue/4)/8;
    }

    private static int rule4(double numericalValue) {
        return ((int)java.lang.Math.sqrt(numericalValue)) * -12;
    }

    private static int rule5(int numericalValue) {
        int sum = 0;
        for(int i = 1; i<=numericalValue; i++) {
            if(numericalValue % i == 0) {
                sum += i;
            }
        }
        return (sum * 10)%26;
    }

    private static char compilation(char charValue, int rule) {
        int convertedInt = numericalValue(charValue);
        if(rule == 1){
            convertedInt = (rule1(convertedInt));
        }
        if(rule == 2) {
            convertedInt = rule2(convertedInt);
        }
        if(rule == 3){
            convertedInt = rule3(convertedInt);
        }
        if(rule == 4) {
            convertedInt = rule4(convertedInt);
        }
        if(rule == 5){
            convertedInt = rule5(convertedInt);
        }

        return charValue(convertedInt + numericalValue('A'));
    }

    private static char encodedLetter(int offset, char letter, int rule) {
        return 'A';
    }
}
