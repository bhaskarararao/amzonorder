package org.example;

import java.util.Arrays;

public class MissingNumbers {

    public static int[] findMissNumber(int count, int[] sortedNumbers){
        int tempCount=0;
        int misIndex=0;
        int[] missingNum = new int[count];
        for(int i=0;i<sortedNumbers.length;i++){
            tempCount++;
                int num= sortedNumbers[i];
                if(tempCount!=num){
                    missingNum[misIndex++]=tempCount;
                    tempCount++;
                }
        }
        return missingNum;
    }

    //Select * from product p,price pric where p.id=pric.productid;
    //select *from product p left join price pr on p.productId=pr.id;

    public static void main(String[] args){
        int[] sortedNumbers = {1,2,3,4,6,7,8,10};
        System.out.println(Arrays.toString(findMissNumber(10,sortedNumbers)));

    }
}
