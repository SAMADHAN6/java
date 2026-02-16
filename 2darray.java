import java.util.Scanner;

public class 2darray {

    public static void main(string[] args){
        int r1,c1 ;

        Scanner s  = new Scanner(System.in);
        r1= s.nextInt();
        c1= s.nextInt();

        int[][] arr1 = new int[r1][c1];

        //fo r1st matrix
        for (int i=0 ; i<r1 ; i++){
            for (int j=0 ; j<c1 ; j++){
                arr1[i][j] = s.nextInt();
            }
        }

        for (int i=0 ; i<r1 ; i++){
            for (int j=0 ; j<c1 ; j++){
                System.out.println(arr1[i][j]);
                
            }
        } 



    }
    
}
