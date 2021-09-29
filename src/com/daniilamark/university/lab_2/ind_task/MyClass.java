package com.daniilamark.university.lab_2.ind_task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public   class MyClass {

    static float arrFloat[] = {12,32,2434,35,24,21,34,221};




    public static void main(String[] args) {
        printMass(arrFloat);
        delValues(arrFloat,12, 212, 34, 34);
    }

    public static void printMass(float array[]){
        String intArrayString = Arrays.toString(array);
        System.out.print("\n"+intArrayString);
    }


    public static void delValues(float[] array, float ...nums){

        List<?> list = Arrays.asList(array);

        System.out.println(" ");
        for(int i = 0;i < array.length;i++){
            for(int e = 0;e < nums.length;e++){
                if (array[i] == nums[e]){
                    list.remove(array[i]);
                }
            }
        }
    }




}
