package com.daniilamark.university.lab_2;

public class ProgramTask7 {
    public static void main(String[] args) {
        System.out.println(dayLine(7));
        System.out.println(dayLine(13));
        System.out.println(dayLine(18));
        System.out.println(dayLine(2));

        System.out.println(" ");

        System.out.println(dayLine(27));
        System.out.println(dayLine(-3));
        System.out.println(dayLine(8));
        System.out.println(dayLine(4));
        System.out.println(dayLine(18));
    }

    static String dayLine(int hour){
        if (hour > 24 || hour < 0)
            return "Invalid data";
        else if (hour > 21 || hour < 6)
            return "Good night";
        else if (hour >= 15)
            return "Good evening";
        else if (hour >= 11)
            return "Good after moon";
        else
            return "Good morning";
    }
}
