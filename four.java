package day3;

public class four {
    public static void main(String[] args) {
        //Q4:Make an array size 10 with random string values , and don’t print the values that start with letter 'A'
        String x[]=new String[10];
        x[0]="shahad";
        x[1]="ahmad";
        x[2]="nora";
        x[3]="ali";
        x[4]="nora";
        x[5]="sara";
        x[6]="anas";
        x[7]="lana";
        x[8]="lara";
        x[9]="yara";
        for (int i=0; i< 10;i++){
            if (x[i].charAt(0)!='a') {
System.out.println(x[i]);
            }
        }






    }
}
