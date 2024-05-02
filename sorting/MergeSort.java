package sorting;
public class MergeSort {
    //Time complexity:O(nlogn)
    public static void conquer(int arr[],int si,int mid,int ei){
        int merger[]=new int[ei-si+1];
        int idx1=si;//keep track of first array
        int idx2=mid+1;//keep track of second array
        int mergept=0;//keep track of new array

        while(idx1<=mid&&idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merger[mergept++]=arr[idx1++];
            }
            else{
                merger[mergept++]=arr[idx2++];
            }
        }

        //remaining elements of larger array
        while(idx1<=mid){
            merger[mergept++]=arr[idx1++];
        }
        while(idx2<=ei){
            merger[mergept++]=arr[idx2++];
        }

        for(int i=0,j=si;i<merger.length;i++,j++){
            arr[j]=merger[i];
        }
    }

    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        divide(arr,si,mid);//divide left side
        divide(arr,mid+1,ei);//divide right side

        //merge
        conquer(arr,si,mid,ei);

    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;

        divide(arr, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
