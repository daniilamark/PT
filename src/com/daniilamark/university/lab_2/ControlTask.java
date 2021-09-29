package com.daniilamark.university.lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class ControlTask {
    static Scanner sc = new Scanner(System.in); // Объявляем Scanner
    public static void main(String[] args) {
        int array[];

        array = createMass(5);

        int arrayFirst4[] = copyFirstFourFieldsOfArray(array);
        printMass(arrayFirst4);
        System.out.print(" (Максимальное значение из массива - " + getMax(arrayFirst4)+")");
        System.out.print(" (Минимальное значение из массива - " + getMin(arrayFirst4)+")");

        int arrayReverse[] = reverseArray(array);

        int arrayLast4[] = copyFirstFourFieldsOfArray(arrayReverse);
        printMass(arrayLast4);
        System.out.print(" (Максимальное значение из массива - " + getMax(arrayLast4)+")");
        System.out.print(" (Минимальное значение из массива - " + getMin(arrayLast4)+")");

        System.out.println("");

        Arrays.sort(array);
        printMass(array);
        int min1 = array[0];
        int min2 = array[1];
        System.out.print(" (Первый минимум - " + min1 +")");
        System.out.print(" (Второй минимум - " + min2 +")");

        int arraySortedReverse[] = reverseArray(array);
        int max1 = arraySortedReverse[0];
        int max2 = arraySortedReverse[1];
        System.out.print(" (Первый максимум - " + max1 +")");
        System.out.print(" (Второй максимум - " + max2 +")");
        System.out.println(" ");
        System.out.println("Частное от деления первого максимума на второго " + del(max1, max2));
        System.out.println("Частное от деления первого минимума на второго " + del(min1, min2));
    }
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
    // вывод массива в консоль
    public static void printMass(int array[]){
        String intArrayString = Arrays.toString(array);
        System.out.print("\n"+intArrayString);
    }
    // нахождение максимума
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }
    // нахождение минимума
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    // копируем первые 4 элемента из массива
    private static int[] copyFirstFourFieldsOfArray(int[] source) {
        if(source.length > 4){
            int[] temp = new int[4];
            System.arraycopy(source, 0, temp, 0, 4);
            return temp;
        }else{
            int[] temp = new int[1];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        }
    }
    // переворачиваем массив
    public static int[] reverseArray(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
    }
    // делим число на число
    public static float del(int x, int y){
        if(y!=0){
            float a = (float) x / (float) y;
            return a;
        }else {
            System.out.println("упс... на 0 делить нельзя:(");
            return 1;
        }
    }
}
