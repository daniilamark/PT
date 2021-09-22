package com.daniilamark.university.lab_2;

public class ProgramTask6 {
    public static void main(String[] args) {
        int x = sum(1,2,3);
        int y = sum(4,6,8,10);

        System.out.println("Сумма 3 значений: " + x);
        System.out.println("Сумма 4 значений: " + y);
    }

    // вычисление суммы 3 значений
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    // вычисление суммы 4 значений
    static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}
