package strings;

public class Strbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);

        //replace char
        sb.setCharAt(1, 'i');
        System.out.println(sb);

        //insert char
        sb.insert(0,'S');
        System.out.println(sb);

        //delete char
        sb.delete(0, 1);
        System.out.println(sb);

        //append char
        sb.append("s");
        System.out.println(sb);
    }
}


/*
 Normal string object references to new address in the heap everytime some changes changes are made in the string
 which is time consuming hence String Builder class is used.
 This helps to manipulate the string in place without referencing to new address.
 */