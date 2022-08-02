package day3;

import java.util.Arrays;

public class n {
    public static void main(String[] args) {
        //Q9: Create a method that takes array of numbers and return the biggest number
        int num[] = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        int big =biggest(num);
        System.out.println(big);

    }
    public static int biggest(int[] a){
int big=0;
     for(int i=0;i<a.length;i++){
if(a[i]>big) {
    big = a[i];
}

    }
    return big;
    }}

