package bitmanipulation;

public class setbit {
    public static void main(String[] args) {
        //Set bit operation
        /*
         Steps:
         1)bit mask:-1<<pos
         2)perform bitwise or on n and bitmask
         */
        int n=5;//0101
        int pos=1;
        int bitMask=1<<pos;//left shift --> 0001<<1 gives 0010
        int newNumer=bitMask|n;//0010|0101

        if((bitMask|n)==0)
        {
            System.out.println("Bit is not set");
        }
        else{
        System.out.println("Bit it set");
        System.out.println("New number is "+ newNumer);
        }
    }
}
