package recursion;

public class printnums {
    public static void main(String args[]){
        int n=1;
        displayrecursion(n);
        sumofdigits(5,1,0);
    }

    static void displayrecursion(int n){
        if(n==6)
        return;
        System.out.println(n);
        displayrecursion(n+1);
        
    }

    static void sumofdigits(int n,int i,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumofdigits(n, i+1, sum);
        System.out.println(i);
    }
    /*
        dry run:
        from main:
        sumofdigits(5,1,0)

        recursion stack:
        sumofdigits(5,5,4)->print i and return with sum=sum+5=15
        sumofdigits(5,4,6)
        sumofdigits(5,3,3)
        sumofdigits(5,2,1)
        sumofdigits(5,1,0)

     */
}
