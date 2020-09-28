package com.example.demo.Services;

import javax.management.InvalidAttributeValueException;

public class Phone {

    private String number1;
    private String number2;

    Phone(int number1, int number2) throws InvalidAttributeValueException {
        this.number1 = validateNumber(number1);
        this.number2 = validateNumber(number2);
    }

    private String validateNumber(int number) throws InvalidAttributeValueException {
        // Regular number: '45136534'
        // Also valid number: '4598237423'
        // Invalid number: '5736'

        // Must contain 8 or 10 digits
        int numberLength;
        if (String.valueOf(number).length() == 8) {
            numberLength = 8;
        } else if (String.valueOf(number).length() == 10) {
            numberLength = 10;
        } else {
            throw new InvalidAttributeValueException("Number should be either 8 or 10 digits!");
        }

        // Correct result format: '90 47 92 83'
        // Also correct result format: '+45 28 47 27 48'
        String result = "";
        for (int i = 0; i < numberLength; i++) {

            // Add '+' if number is 10 digits
            if (numberLength == 10 && i == 0) {
                result += "+";
            }

            // Add whitespace after every second digit
            if (i % 3 == 0 && i != 0) {
                result += " ";
            }

            result += String.valueOf(number).charAt(i);
        }

        return result;
    }

}
