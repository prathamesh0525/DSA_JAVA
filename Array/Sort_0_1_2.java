package Array;

public class Sort_0_1_2 {
     public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,0,1,2,0,1,2,0,1,2};
        int low=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
               
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;   

            }
            else if(arr[mid]==1){
                mid=mid+1;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[end];
                arr[end]=temp;
                
                end=end-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
//     for(int i=0;i<arr.length;i++){
//         for(int j=i;j<arr.length;j++){
//             if(arr[i]>arr[j]){
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//     }
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
    
}
