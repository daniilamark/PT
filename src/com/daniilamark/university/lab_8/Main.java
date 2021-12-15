package com.daniilamark.university.lab_8;

import java.util.ArrayList;

public class Main implements Interface{
    public static void main(String[] args) {
        Palm palm = new Palm("Little", 10);
        Flower flower = new Flower("Mac",2 );

        Main main = new Main();
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList = main.classesToList(palm, flower);

        printArrayList(arrayList);
    }

    private static void printArrayList(ArrayList<Object> arrayList) {
        for (Object object : arrayList) {
            System.out.println(object.toString());
        }
    }
}
