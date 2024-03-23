package patterns;
public class advpatterns {
    public static void main(String[] args) {
        //Butterfly pattern
        /*
            *        *
            **      **
            ***    ***
            ****  ****
            **********
            **********
            ****  ****
            ***    ***
            **      **
            *        *
         
         */
        /*int n=5;
        for(int i=1;i<=n;i++)
        {
            //first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            //first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //second part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //parallelogram
        /*
    *****
   *****
  *****
 *****
*****
         */
       /*  int n=5;
        for(int i=1;i<=n;i++)
        {
            //spaces
            int spaces=n-i;
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        //number pyramid
            /*
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5 */
        /*int n=5;
        for(int i=1;i<=n;i++)
        {
            //spaces
        
            int spaces=n-i;
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */

        //palindromic pattern
        /*
    1
   212
  32123
 4321234
543212345
         */
        
       /*  int n=5;
        for(int i=1;i<=n;i++)
        {
             //spaces
        
             int spaces=n-i;
             for(int j=1;j<=spaces;j++)
             {
                 System.out.print(" ");
             }
             //first half numbers
             for(int j=i;j>=1;j--)
             {
                System.out.print(j+"");
             }

             //second half numbers
             for(int j=2;j<=i;j++)
             {
                System.out.print(j+"");
             }

            System.out.println();
        }*/

        //Diamond pattern
        int n=4;
          //upper half
        for(int i=1;i<=n;i++)
        {
             //spaces
        
             int spaces=n-i;
             for(int j=1;j<=spaces;j++)
             {
                 System.out.print(" ");
             }

           
             for( int j=1;j<=2*i-1;j++)
             {
                System.out.print("*");
             }
             System.out.println();
            }

             //lower half
            for(int i=n;i>=1;i--)
        {
             //spaces
        
             int spaces=n-i;
             for(int j=1;j<=spaces;j++)
             {
                 System.out.print(" ");
             }

            
             for( int j=1;j<=2*i-1;j++)
             {
                System.out.print("*");
             }
             System.out.println();
            }
    }
}


