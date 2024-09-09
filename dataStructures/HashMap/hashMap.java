package dataStructures.HashMap;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer>count=new HashMap<>();

        String s="abbcdeffh";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(count.containsKey(ch)){
                count.put(ch,count.get(ch)+1);
            }
            else{
                count.put(ch,1);
            }
        }

        System.out.println(count);
        System.out.println(count.get('b'));
    }
}
