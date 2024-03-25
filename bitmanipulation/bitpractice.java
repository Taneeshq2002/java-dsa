package bitmanipulation;
import java.util.Scanner;

public class bitpractice {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // sc.close();
        
       /*  if((n&(n-1))==0){
            System.out.println(n+" is a power of 2");
        }
        else{
            System.out.println(n+" is not a power of 2");
        }*/

        //count number of 1 bit
      /*   int count=0;
        while(n>0){
            count=count+(n&1);
            n=n>>1;
        }
        System.out.println(count);*/

        String n1="0100";
        int n2=4;
        int newnum=Integer.parseInt(n1);

       String sum="";
       while(n2>0){
        sum=sum+Integer.toString(n2%2);
        n2=n2/2;
       }
       System.out.println(sum);
    }
}
