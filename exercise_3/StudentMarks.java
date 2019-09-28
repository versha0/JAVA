import java.util.*;
import java.lang.*;
class StudentMarks{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numOfStudents= sc.nextInt();
        int[] stuGrades= new int[numOfStudents];
        System.out.println("ENTER THE GRADES OF THE STUDENTS");
        for(int i=0;i<numOfStudents;i++){
            stuGrades[i]=sc.nextInt();

        }
        for(int i=0;i<numOfStudents;i++){
            try{
            if(stuGrades[i]<0 || stuGrades[i]>100){
                throw new Exception("ERROR");

            }

        }
        catch(Exception e){
                System.out.println("OUT OF RANgE EXCEPTION");
        }
    }
        sc.close();
    }
}