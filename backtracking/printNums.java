package backtracking;
import java.util.Scanner;
public class printNums {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Reverse:");
        printNumReverse(1,n);
        System.out.println("Forward:");
        printNum(n,n);
    }

    public static void printNumReverse(int i,int n){
        if(i>n)
        return;

        printNumReverse(i+1, n);
        System.out.println(i);
    }

    public static void printNum(int i,int n){

        if(i<1)
        return;

        printNum(i-1, n);
        System.out.println(i);
    }
}
