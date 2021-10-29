package com.daniilamark.university.lab_2.ind_task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyClass {
    static double arrFloat[] = {12.0, 32.3, 2434.22, 2121.3, 1.65, 32.2};
    static int arrInt[] = {-12, -32, -24, 21, 1, 5};

    public static void main(String[] args) {
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Массив вещественных чисел: ");
        printMass(arrFloat);
        System.out.println("\nМассив вещественных чисел после удаления заданного значения: ");
        printMass(removeNumbers(arrFloat, 2434.22));
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Элементы:");
        printMassInt(arrInt);
        System.out.println("\nМаксимум среди отрицательных элементов: " + getMaxNumLessZero(arrInt));

        System.out.println("----------------------------------------------------------");
        String s = "Российский государственный профессионально-педагогический университет";
        System.out.println("Текст: " + s);
        System.out.println("Аббревиатура из текста: " + getAbbreviation(s));
        System.out.println("----------------------------------------------------------");
    }
    public static void printMass(double array[]){
        String doArrayString = Arrays.toString(array);
        System.out.print(doArrayString);
    }
    public static void printMassInt(int arrayI[]){
        String intArrayString = Arrays.toString(arrayI);
        System.out.print(intArrayString);
    }

    // Метод, удаляющий из массива вещественных чисел заданные значения
    public static double[] removeNumbers(double[] array, double num ) {
        List<Double> list = new ArrayList<>();
        for (double n : array) {
            if (n != num) {
                list.add(n);
            }
        }
        double[] result = new double[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).doubleValue();
        }
        return result;
    }

    // Метод, вычисляющий максимум среди элементов, имеющих отрицательное значение.
    public static int getMaxNumLessZero(int[] inputArray){
        int maxValue = inputArray[0];
        List<Integer> listLessZero = new ArrayList<>();
        for (int n : inputArray) {
            if (n < 0) {
                listLessZero.add(n);
            }
        }
        int[] arrayLessZero = new int[listLessZero.size()];
        for(int i = 1; i < arrayLessZero.length; i++){
            if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Метод, получающий аббревиатуру заданного текста
    public static String getAbbreviation(String str){
        String result = str.replaceAll("\\B.|\\P{L}", "").toUpperCase();
        return result;

    }
}
