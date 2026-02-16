import java.util.Scanner;

public class matrixarray {

    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.println("enter the r,c for 1st matrix");
        int r1,c1 ;

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
                System.out.print(arr1[i][j] + " " );

            }
            System.out.print("\n");
        } 

        System.out.println("enter the r,c for 2st matrix");

        int r2,c2 ;

        r2= s.nextInt();
        c2= s.nextInt();

        int[][] arr2 = new int[r2][c2];

        //fo ran2nst matrix
        for (int i=0 ; i<r2 ; i++){
            for (int j=0 ; j<c2 ; j++){
                arr2[i][j] = s.nextInt();
            }
        }

        for (int i=0 ; i<r2 ; i++){
            for (int j=0 ; j<c2 ; j++){
                System.out.print(arr2[i][j] + " " );

            }
            System.out.print("\n");
        }


        //addtion of arr1 and arr2 
        System.out.println("here is the summ of two martix:");
        int [][] sum = new int[r1][c1];

        for (int i=0 ; i<r1 ; i++){
            for (int j=0 ; j<c1 ; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i=0 ; i<r2 ; i++){
            for (int j=0 ; j<c2 ; j++){
                System.out.print(sum[i][j] + " " );

            }
            System.out.print("\n");
        }


         // for multification 
         System.out.println("here is the multification of arr1 and arr2:");


         int[][] mult = new int[r1][c1];
         for (int i=0 ; i<r1 ; i++){
            for (int j=0 ; j<c2 ; j++){
                for(int k =0 ; k<c1 ; k++)
                mult[i][j] += arr1[i][k]*arr2[k][j];
            }
        }
        for (int i=0 ; i<mult.length ; i++){
            for (int j=0 ; j<mult[0].length; j++){
                System.out.print(mult[i][j] + " " );

            }
            System.out.print("\n");
        }

         

        










    }
    
}
