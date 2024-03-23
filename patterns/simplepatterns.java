package patterns;
public class simplepatterns{
    public static void main(String args[]){
        //Hollow rectangle
        /*
         * * * * * *
         *         *
         * * * * * *       
         */
        /*for(int i=0;i<4;i++){
            if(i==0||i==3)
            for(int j=0;j<5;j++)
            {
                System.out.print("* ");
            }
            else{
                for(int j=0;j<5;j++)
            {
                if(j==0||j==4)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            }
            System.out.println();
        }*/

        //Pyramid(normal and inverted)
    //     int n=4;
    //     int m=4;

    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=n;j>=i;j--)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    ///Pyramid 180 degrees inverted
    // int n=5;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=n;j>=i;j--){
    //             System.out.print(" ");
    //         }
    //         for(int k=1;k<=i;k++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //Number pyramid
    // int n=5;
    // int num=1;
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         System.out.print(num+" ");
    //         num++;
    //     }
    //     System.out.println();
    // }

    
    int n=5;
   int num;
    for(int i=1;i<=n;i++){
        if(i%2==0){
            num=0;
        for(int j=1;j<=i;j++){
            if(num==1){
            System.out.print(num);
            num--;}
            else{
                System.out.print(num);
            num++;
            }
        }
    }
    else{
        num=1;
        for(int j=1;j<=i;j++){
            if(num==1){
            System.out.print(num);
            num--;}
            else{
                System.out.print(num);
            num++;
            }
        }
    }
        System.out.println();
    }
    /*
       1
       01
       101 
       0101
       10101
     */
     }
}
