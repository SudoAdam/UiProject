package com.example.demo.Services;

import javax.management.InvalidAttributeValueException;

public class Phone {

    private String number1 = null;
    private String number2 = null;

    public Phone(int number1) throws IllegalArgumentException {
        this.number1 = validateNumber(number1);
    }

    public Phone(int number1, int number2) throws IllegalArgumentException {
        this.number1 = validateNumber(number1);
        this.number2 = validateNumber(number2);
    }

    private String validateNumber(int number) throws IllegalArgumentException {
        // Regular number: '45136534' - 8 digits
        // Also valid number: '4598237423' - 10 digits
        // Invalid number: '5736'

        // Must contain 8 digits or 10 if first 2 are 45
        int numberLength;
        if (String.valueOf(number).length() == 8) {
            numberLength = 8;
        } else if (String.valueOf(number).length() == 10 && String.valueOf(number).indexOf(0) == 4 && String.valueOf(number).indexOf(1) == 5) {
            numberLength = 10;
        } else {
            throw new IllegalArgumentException("Number should be either 8 digits, or 10 with the country code 45!");
        }

        // Correct result format: '90 47 92 83'
        // Also correct result format: '+45 28 47 27 48'
        String result = "";
        for (int i = 0; i < numberLength; i++) {

            // Add '+' if number is 10 digits
            if (numberLength == 10 && i == 0) {
                result += "+";
            }

            result += String.valueOf(number).charAt(i);

            // Add whitespace after every second digit
            if (i % 2 == 0 && i != 0) {
                result += " ";
            }

        }

        return result;
    }

}
