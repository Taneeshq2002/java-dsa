package recursion;
public class factorial {
    public static void main (String args[]){
        int res=calFact(5);
        System.out.println(res);
    }
    static int calFact(int n){
        if(n==0||n==1){
            return 1;
        }

        int fact_n=n*calFact(n-1);
        return fact_n;
    }
}
