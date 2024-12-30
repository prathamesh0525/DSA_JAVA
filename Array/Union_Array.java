package Array;

import java.util.Arrays;

public class Union_Array {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,5,1,7,9,8};
        int j=0;
        int union[]=new int [arr1.length+arr2.length];
        for(int i=0;i<union.length;i++){
            union[i]=arr1[j];
            j++;
        }
        
    }
}
