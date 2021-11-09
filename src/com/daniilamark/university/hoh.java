package com.daniilamark.university;

import java.util.Arrays;
import java.util.Scanner;

public class hoh {
    static Scanner sc = new Scanner(System.in); // Объявляем Scanner

    public static int[] createMass(int sizeMass){
        int[] array = new int[sizeMass]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива: ");
        // заполняем массив
        for (int i = 0; i < sizeMass; i++) {
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            } else {
                System.out.println("Вы ввели не число");
                break;
            }
        }
        return array;
    }

    public static void printMass(int array[]){
        String intArrayString = Arrays.toString(array);
        System.out.print("\n"+intArrayString);
    }

    public static void main(String[] args) {
        int arr[] = createMass(3);
        printMass(arr);
    }

}
