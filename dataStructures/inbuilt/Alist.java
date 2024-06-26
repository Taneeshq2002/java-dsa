package dataStructures.inbuilt;
import java.util.ArrayList;
import java.util.Collections;

public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int ele=list.get(1);
        System.out.println(ele);

        //add element in between
        list.add(0,4);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
