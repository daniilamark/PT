package com.daniilamark.university.lab_2;

public class ProgramTask5 {

    public static void main(String[] args) {
        sum("Welcome!", 20, 10);
        sum("Welcome!");
        sum("Welcome!", 212, 82, 1, 89, 26, 63, 82);
    }

    static void sum(String message, int ... nums){
        System.out.println(message);
        int result = 0;
        for(int x:nums){
            result += x;
        }
        System.out.println("Сумма равна: " + result);
    }
}
