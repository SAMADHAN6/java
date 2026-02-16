import java.util.Scanner;


public class LinearSearchNoFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size  = s.nextInt();
        int[] arr = new int[size];


        for(int i=0 ; i< size ; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("enter the element to serch :");
        int key = s.nextInt();


        for(int i=0 ; i< size ; i++){
            if (arr[i] == key ){
                System.out.println("here is the elemment at index  ---" + i);
            }
        }

        


        
    }
}