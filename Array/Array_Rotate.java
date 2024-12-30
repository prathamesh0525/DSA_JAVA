package Array;
import java.util.*;
public class Array_Rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Rotation:");
        int k=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7,8};
        int j=0;
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];

        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

    }
    
}
