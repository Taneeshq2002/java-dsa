package bitmanipulation;

public class clearbit {
    public static void main(String[] args) {
        /*
         Steps:
         1)bitmask 1<<pos
         2)Take NOT of bitmask
         3)AND the original number with new bitmask
         */

         int n=5;
         int pos=2;
         int bitMask=1<<pos;
         int notbitMask=~(bitMask);

         int newNumber=notbitMask & n;
         System.out.println(
            newNumber
         );

    }
}
