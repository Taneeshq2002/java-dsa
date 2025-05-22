package recursion;
import java.util.Scanner;
public class printNames{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printName(1,n);
    }

    public static void printName(int i,int n){
        if(i>n)
        return;

        System.out.println("Name");
        i++;
        printName(i,n);

    }
}