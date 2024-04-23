package backtracking;

public class Permutation {

    public static void printPerm(String str,String perm,int idx){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        //keeping each character at first place once
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);//removes first character
            System.out.println("newStr:"+newStr);
            printPerm(newStr, perm+curChar, idx+1);
        }
    }
    public static void main(String[] args) {
        String str="ABC";
        printPerm(str, "", 0);
    }    
}
