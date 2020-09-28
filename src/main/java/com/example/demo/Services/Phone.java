package com.example.demo.Services;

public class Phone {

    private String number1;
    private String number2;

    Phone(int number1, int number2) {
        this.number1 = validateNumber(number1);
        this.number2 = validateNumber(number2);
    }

    private String validateNumber(int number) {
        // Regular number: '45136534'
        // Also valid number: '4598237423'
        // Invalid number: '5736'
        // Must contain 8-10 longs


        return "";
    }

}
