package recursion;
public class StringReverse {
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

    public static void printRev(String msg,int index){
        if(index==0){
            System.out.println(msg.charAt(index));
            return ;
        }
        System.out.println(msg.charAt(index));
        printRev(msg, index-1);
        
    }

    public static void main(String[] args) {
        String msg="abaacdaefaah";
        // printRev(msg, msg.length()-1);
        FindOccurence(msg, 0,'a');
    }
}
