import java.util.*;
import java.lang.*;
class myMatrixSum{
    public static void main(String[] args ){
    int noOfMatrix=2;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int row=sc.nextInt();
    System.out.println("Enter the number of columns");
    int column = sc.nextInt();
    int[][] arr= new int[row][column];
    int[][] arr1= new int[row][column];
    int[][] sum= new int[row][column];
    System.out.println("Enter the elements of the first matrix");
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    System.out.println("Enter the elements of the second matrix");
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            arr1[i][j]=sc.nextInt();
            sum[i][j]=arr[i][j]+arr[i][j];
        }
    }
    System.out.println("The sum of two matrix you entered is ");
    for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            
            sum[i][j]=arr[i][j]+arr[i][j];
            System.out.print(sum[i][j]+ "  ");

        }
        System.out.println("");
    }
    }

}
