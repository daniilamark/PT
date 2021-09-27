package com.daniilamark.university.lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class ControlTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Объявляем Scanner

        System.out.println("Введите длину массива: ");
        int size = sc.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива");
        /*Пройдёмся по всему массиву, заполняя его*/

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        String intArrayString = Arrays.toString(array);
        System.out.println("\nПолучен массив: " +intArrayString);

    }



}
