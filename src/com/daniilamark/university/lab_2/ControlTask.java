package com.daniilamark.university.lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class ControlTask {
    Scanner sc = new Scanner(System.in); // Объявляем Scanner


    public static void main(String[] args) {
        int array[];
        ControlTask cTask = new ControlTask();
        array = cTask.createMass(5);

        int arrayFirst4[] = cTask.copyFirstFourFieldsOfArray(array);
        cTask.printMass(arrayFirst4);
        System.out.print(" (Максимальное значение из массива - " + cTask.getMax(arrayFirst4)+")");
        System.out.print(" (Минимальное значение из массива - " + cTask.getMin(arrayFirst4)+")");

        int arrayReverse[] = cTask.reverseArray(array);


        int arrayLast4[] = cTask.copyFirstFourFieldsOfArray(arrayReverse);
        cTask.printMass(arrayLast4);
        System.out.print(" (Максимальное значение из массива - " + cTask.getMax(arrayLast4)+")");
        System.out.print(" (Минимальное значение из массива - " + cTask.getMin(arrayLast4)+")");

        System.out.println("");

        Arrays.sort(array);
        cTask.printMass(array);
        int min1 = array[0];
        int min2 = array[1];
        System.out.print(" (Первый минимум - " + min1 +")");
        System.out.print(" (Второй минимум - " + min2 +")");

        int arraySortedReverse[] = cTask.reverseArray(array);
        int max1 = arraySortedReverse[0];
        int max2 = arraySortedReverse[1];
        System.out.print(" (Первый максимум - " + max1 +")");
        System.out.print(" (Второй максимум - " + max2 +")");
        System.out.println(" ");
        System.out.println("Частное от деления первого максимума на второго " + cTask.del(max1, max2));
        System.out.println("Частное от деления первого минимума на второго " + cTask.del(min1, min2));

    }

    public int[] createMass(int sizeMass){
        int[] array = new int[sizeMass]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива: ");
        // заполняем массив
        for (int i = 0; i < sizeMass; i++) {
            array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        return array;
    }

    public void printMass(int array[]){
        String intArrayString = Arrays.toString(array);
        System.out.print("\n"+intArrayString);
    }

    //здесь находим максимум
    public int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    // здесь находим минимум
    public int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    private int[] copyFirstFourFieldsOfArray(int[] source) {
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

    public int[] reverseArray(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
    }

    public float del(int x, int y){
        if(y!=0){
            float a = (float) x / (float) y;
            return a;
        }else {
            System.out.println("упс... на 0 делить нельзя:(");
            return 1;
        }
    }

}
