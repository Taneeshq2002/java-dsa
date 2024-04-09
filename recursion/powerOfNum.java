package recursion;

public class powerOfNum {
    public static void main(String args[]){
        int x=2;
        int n=5;
        int res=calPower(x, n);  
    System.out.println(res);  }

    public static int calPower(int x,int n){

        if(n==0)
        return 1;
        if(x==0)
        return 0;
        int xPownm1=calPower(x, n-1);
        int xPown=x*xPownm1;
        return xPown;
    }
    
}
