package Array;

public class Min_Max_Element {
    public static void main(String[] args) {
        int arr[]={1,8,9,0,2,-5};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("Max Element of Array:"+max);
        System.out.println("minimum Element of Array:"+min);
    }
    
}
