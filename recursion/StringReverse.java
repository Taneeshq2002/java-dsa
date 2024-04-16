package recursion;

import java.util.HashSet;

public class StringReverse {
    //Find firts and last occurence of a character
    public static int first=-1;
    public static int last=-1;

    public static void FindOccurence(String str,int idx,char c){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==c){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        FindOccurence(str, idx+1, currChar);
    }

    //print reverse of string usign recursion
    public static void printRev(String msg,int index){
        if(index==0){
            System.out.println(msg.charAt(index));
            return ;
        }
        System.out.println(msg.charAt(index));
        printRev(msg, index-1);
        
    }

    //Move all x to the end of the string

    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }

        if(str.charAt(idx)=='x'){
                count++;
                moveAllX(str, idx+1, count, newString);
        }
        else{
            newString+=str.charAt(idx);
            moveAllX(str, idx+1, count, newString);
        }
    }



    //Removoe duplicate characters
    public static boolean map[]=new boolean[26];
    public static void removeDuplicates(String str,int idx,String newString){
        char currChar=str.charAt(idx);

        if(idx==str.length()-1){
            System.out.println(newString);
            return;
        }

        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }

    }

    //Find all subsequences
    public static void subsequences(String str,int idx,String newString){
       

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        //choice to be present in the string
        subsequences(str, idx+1, newString+currChar);

        //choice to not be present in the string
        subsequences(str, idx+1, newString);
    }

    //To print only unique subsequences
    public static void uniquesubsequences(String str,int idx,String newString,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        char currChar=str.charAt(idx);
        //choice to be present in the string
        uniquesubsequences(str, idx+1, newString+currChar,set);

        //choice to not be present in the string
        uniquesubsequences(str, idx+1, newString,set);
    }

    public static void main(String[] args) {
        String msg="abaacdaefaah";
        HashSet<String>set=new HashSet<>();
        // printRev(msg, msg.length()-1);
        // FindOccurence(msg, 0,'a');
        // moveAllX("axbcxxdx",0,0, "");
        // removeDuplicates("abbccda", 0, "");
        subsequences("abc", 0, "");
        uniquesubsequences("aaa",0,"",set);
    }
}
