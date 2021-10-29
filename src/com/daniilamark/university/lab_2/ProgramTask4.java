package com.daniilamark.university.lab_2;

public class ProgramTask4 {
    public static void main(String[] args) {
        display("Tom","Error","gif", 34);
        display("Bob","Ask","gof",28);
        display("Sam","Load","gef",23);
    }

    static void display(String name, String lastName,String lasName, int age){
        System.out.println("Имя: " + name + " | " +" Фамилия: " + lastName +" | " + " Отчество: " + lasName + " | " + " Возраст: " + age);
    }
}
