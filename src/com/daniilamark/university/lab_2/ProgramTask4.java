package com.daniilamark.university.lab_2;

public class ProgramTask4 {
    public static void main(String[] args) {
        display("Tom","Error", 34);
        display("Bob","Ask",28);
        display("Sam","Load",23);
    }

    static void display(String name, String lastName, int age){
        System.out.println("Имя: " + name + " | " +" Фамилия: " + lastName + " | " + " Возраст: " + age);
    }
}
