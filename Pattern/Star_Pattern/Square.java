package Pattern.Star_Pattern;

public class Square {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if (i==0||i==n||j==0||j==n){
                    System.out.print(5+" ");
                }
                if(i==1&(j==1)){
                    System.out.print(4+" ");
                }
            System.out.println();
        }
    }
    
}
}
