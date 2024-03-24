package strings;
import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        
      /* String name1="a";
        String name2="A";

        //s1>s2-->+ve
        //s1<s2-->-ve
        //s1=s1-->0
        System.out.println(name1.compareTo(name2));*/
        //compares ascii value and returns difference between values

       /*  String name="My name is Tony";
        String newName=name.substring(0,name.length());
        System.out.println(name==newName);//returns true*/


        //Replacing characters manually
       /*  Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        String res="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e'){
                res+="i";
            }
            else{
                res+=str.charAt(i);
            }
        }
        System.out.println(res);*/



        //Email to username
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        sc.close();
        int index=email.indexOf("@");
        String username=(email.substring(0,index));
        System.out.println(username);
    }
}
