package day3;

public class e {
    public static void main(String[] args) {
        //Q8:Create a method that takes 4 numbers and return the average of these numbers
        num(1,2,3,4);

    }
    public static int num(int a, int x, int y, int z){
       int sum= a+x+y+z;
       int average= sum/4;
        System.out.println(average);
        return sum;
    }
}
