package Array;

public class Array_Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        System.out.print("Reverse Array :  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
    
}
