package bitmanipulation;

public class updatebit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        //to change 0 to 1 perform setbit operation
        int newNumber=bitMask | n;
        System.out.println(newNumber);

        //to change 1 to 0 perform clearbit operation
        int notBitmask=~(bitMask);
        int finalNumber=notBitmask & n;
        System.out.println(finalNumber);
    }
    
}
