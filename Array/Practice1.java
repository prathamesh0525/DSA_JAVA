package Array;

public class Practice1 {
    public static void main(String[] args) {
        int arr[][]=new int[2 ][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=23;
        arr[1][1]=34;
        arr[1][2]=567; 
     
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
            
        }
    }
    
}
