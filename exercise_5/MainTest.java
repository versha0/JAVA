import java.util.*;
import java.lang.*;

class MainTest {
    public static void main(String[] args){
        Student student1= new Student();
        Student student2= new Student();
        Student student3= new Student();
        Student student4= new Student();
        Student student5= new Student();
        student1.setage(23);
        student1.setname("Versha");
        student1.setstudentid(412706);
        student2.setage(43);
        student2.setname("Rutuja");
        student2.setstudentid(412409);
        student3.setage(3);
        student3.setname("Singh");
        student3.setstudentid(312409);
        student4.setage(2);
        student4.setname("Verma");
        student4.setstudentid(789087);
        student5.setage(43);
        student5.setname("Jagriti");
        student5.setstudentid(372291);
        List<Student> studentlist= new ArrayList<>();
        studentlist.add(student1);
        studentlist.add(student2);
        studentlist.add(student3);
        studentlist.add(student4);
        studentlist.add(student5);
        for(Student s:studentlist){
        System.out.println(s.getstudentid()  +s.getname()+ s.getage());

        }
        Collections.sort(studentlist, new StudentSorter());
        for(Student s:studentlist){
            System.out.println(s.getstudentid()  +s.getname()+ s.getage());
    
            }

    }
}
class StudentSorter implements Comparator<Student> {

    public int compare(Student a, Student b) 
    { 
        int q= a.getage() - b.getage(); 
         if(q==0){
            return a.getname().compareTo(b.getname());
        }
        else
        return a.getage() - b.getage();
    } 

}