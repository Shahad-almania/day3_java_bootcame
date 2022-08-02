package day3;

import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        //Q3:Make an array size 5 with random string values and print it in reverse order
        int  num[] = new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        for(int i=num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }

    }
}

