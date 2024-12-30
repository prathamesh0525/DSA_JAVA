package Searching.Binary_Search;

public class Search_Element {
    public static void main(String[] args) {
        int key=9;
        int arr[]={1,7,6,9,2,5,3,4};
        int start=0;
        int end=arr.length-1;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int i=0; 
           while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                System.out.println(mid);
            }
            
            if(arr[mid]<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
          

        }
       
       
    }
    
}
