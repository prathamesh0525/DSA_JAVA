package Searching.Binary_Search;

public class First_Last_Occurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,4,5,6,4,3,2,1,1,2,3,2,1,2,3,2,3,4,5,3,2};
        int key=2;
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int temp[]=new int [2];
        int i=0;
        while(start<=end){
            if(arr[start]==key){
                temp[i]=start;
                i=i+1;
            }
            else{
                start+=1;
            }
            if(arr[end]==key){
                temp[i]=end;
                i=i+1;
                
            }
            else{
                
                end-=1;
            }
            
        }
        for(int j=0;j<temp.length;j++){
            System.out.print(temp[i]+" ");
        }
    }
    
}
