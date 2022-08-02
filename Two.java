package day3;

public class Two {
    public static void main(String[] args) {
        //Q2:Print the numbers from 1 -  33 , don't print the numbers that multiple of 5
        for(int i=1; i<=33; i++){
            if(i%5==0){
                continue;

            }
            System.out.println(i);
        }
    }
}
