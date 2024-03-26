package sorting;

public class selectionSort {

    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
    public static void main(String[] args) {
        //Selection Sort
        /* This sorting technique selects the smallest item form the array first and swaps it with the item
        at current ith index.
        The inner loops runs n-i times since for every ith iteration one element gets sorted.
        Time complexity:O(n^2)
         * 
         */
        int arr[]={7,8,3,1,2};

        for(int i=0;i<arr.length;i++)
        {
            int smallest=arr[i];
            int smallest_index=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<smallest){
                    smallest=arr[j];
                    smallest_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest_index];
            arr[smallest_index]=temp;
        }

        printArray(arr);
    }

}

//Dry run
/*
 7 8 3 1 2
 lenght=5

 for i=0,smallest=7,smallest_index=0
 j=0->7<7->false
 j=1->8<7->false
 j=2->3<7->true->smallest=3,smallest_index=2
 j=3->1<3->true->smallest=1,smallest_index=3
 j=4->2<1->false

 swap arr[0](7),arr[3](1)
 result:-1 8 3 7 2

 for i=1,smallest=8,smallest_index=1
 j=1->8<8->false
 j=2->3<8-true->smallest=3,smallest_index=2
 j=3->7<3->false
 j=4->2<3->true->smallest=2,smallest_index=4

 swap arr[1](8),arr[4](2)
 result:-1 2 3 7 8
 */
