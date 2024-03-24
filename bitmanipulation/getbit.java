package bitmanipulation;

public class getbit {
    public static void main(String[] args) {

        //Get Bit operation
        /*Steps:
         1)bit mask:- 1<<i (where is position of bit)
         2)perform bitwise and between bitmask and orignal n

         Since bitmask(1) has only one binary 1 which is shifted to the required position hence it is deciding factor.
         If resultant & gives 0 means the bit in original number at that position is 0 since(1&0=0).
         */
        int n=5;//0101
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask&n)==0){
            System.out.println("Bit at pos was 0");
        }
        else
        System.out.println("Bit was 1");
    }
}
