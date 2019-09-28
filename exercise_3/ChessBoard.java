import java.util.*;
import java.lang.*;

public class ChessBoard{
     public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols= sc.nextInt();

        String output[][] = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (((i + j) % 2) == 0) {
                    output[i][j] = "WW";
                } else {
                    output[i][j] = "BB";
                }

            }


        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        
     }
    }
}