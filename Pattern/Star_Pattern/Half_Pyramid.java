package Pattern.Star_Pattern;

import java.util.Scanner;

public class Half_Pyramid {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your No:");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*" +" ");

            }
            System.out.println();
            

        }
        
    }
    
}
