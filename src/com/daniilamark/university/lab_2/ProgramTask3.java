package com.daniilamark.university.lab_2;

public class ProgramTask3 {
    private int numSum; // возвращаемая сумма

    public static void main(String[] args) {
        ProgramTask3 program = new ProgramTask3();

        String str_1 = (" ← сумма чисел 75 и 13;");
        String str_2 = (" ← сумма чисел, полученных в результате суммирования последних двух вызовов метода sum");
        String str_3 =(" ← разность чисел, переданных как параметры в метод sum");

        int a = 6;
        int b = 8;
        System.out.println("Это было: ");
        int call_1 = program.sum(a, b);
        int call_2 = program.sum(3, a);
        int call_3  = program.sum(5, 23);

        System.out.println("\n"+"Это выполение 3 задания: ");

        int call_4 = program.sum(73, 15, str_1); // 1) сумма чисел 75 и 13;
        program.sum(call_3, call_4, str_2 ); // 2) сумма чисел, полученных в результате суммирования последних двух вызовов метода sum;
        int numDifference = program.sum(100, -50, str_3); // 3) разность чисел, переданных как параметры в метод sum.
    }

    private int sum(int x, int y, String str){
        numSum = x + y;
        System.out.println(numSum + str);
        return numSum;
    }

    private int sum(int x, int y){
        numSum = x + y;
        System.out.println(numSum);
        return numSum;
    }
}
