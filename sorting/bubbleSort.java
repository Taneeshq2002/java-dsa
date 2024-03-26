package sorting;

public class bubbleSort {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        /*It is a sorting technique which sorts one element at a time and places the largest  
            element at the end for every ith iteration
        The consecutive elements are compared and swapped if condition satisifes.
        Time-complexity:O(n^2)                        
        */

        int arr[]={7,8,3,1,2};

        for(int i=0;i<arr.length-1;i++)//outer loop runs for n-1 times
        {
            for(int j=0;j<arr.length-i-1;j++) //inner loops runs for i less times for every ith iteration 
                                            //because one element gets placed correctly in every ith iteration
            {
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }

        }

        printArray(arr);
    }
}

//Dry run
/*
length=5
    for i=0,
    j=0->7 8 3 1 2->7 8 3 1 2
    j=1->7 8 3 1 2->7 3 8 1 2
    j=2->7 3 8 1 2->7 3 1 8 2
    j=3->7 3 1 8 2->7 3 1 2 8
    j=4->exits inner loop

    for i=1;
    j=0->7 3 1 2 8->3 7 1 2 8
    j=1->3 7 1 2 8->3 1 7 2 8
    j=2->3 1 7 2 8->3 1 2 7 8
    j=3->exits loop
 */
