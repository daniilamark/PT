package com.daniilamark.university.lab_1;

//Программа сортировки массива простым выбором
public class ProgramSelectionSort{

    public static void main(String[] args) {
        ProgramSelectionSort program = new ProgramSelectionSort();
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        program.printArray(array); // вызов метода
    }
    // метод сортировки и вывода элементов массива
    private  void printArray (int [] array) {

        // вывод несортированного массива в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(); // просто отступ

        // сортировка
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            //Вызов метода swap для обмена элементов
            swap(array, left, minInd);
        }

        // вывод отсортированного массива в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    // метод swap для обмена элементов
    private void swap(int[] array, int left, int minInd){
        int tmp = array[left];
        array[left] = array[minInd];
        array[minInd] = tmp;
    }
}
