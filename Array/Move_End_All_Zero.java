package Array;

public class Move_End_All_Zero {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9};
        int start=arr[0];
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i;j<arr.length;j++){

                
                    int temp=arr[i];
                    if(arr[j]!=0){
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                    else{
                        continue;
                    }
               
                }
            
                    
            }
            continue;
           
        }
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
       

    }
}
