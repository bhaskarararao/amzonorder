package org.example;

public class MissingNum {
    public static void main(String[] args){
        int[] input = { 1, 1, 2, 3, 5, 6, 7, 9, 5, 9 };
        int[] register = new int[input.length];
        for (int i : input) {
            //System.out.println(i);
           // System.out.print(register[i] = 1);
            register[i] = 1;
        }
        // now, let's print all the absentees System.out.println("missing numbers in given array");
        for (int i = 1; i < register.length; i++)
        {
            if (register[i] == 0)
            {
                System.out.println(i);
            }
        }
    }



}
