import java.util.*;

class User {
    private String firstname;
    private String secondname;
    private int age;
    private int salary;

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setsecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public String getfirstname() {
        return this.firstname;
    }

    public String getsecondname() {
        return this.secondname;
    }

    public int getage() {
        return this.age;
    }

    public int getsalary() {
        return this.salary;
    }

    void isvalidage(int agee) {
        if (agee > 1 && agee <100) {
            if (agee > 18 && agee <= 60)
                System.out.println("Entered age is valid");
            else
                System.out.println("Entered age is not valid");
        } 
    
        else {
            System.out.println("Invalid age");
        }

    }
}

    public class Usermain {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name");
            String f = sc.nextLine();
            System.out.println("Eneter secon name");
            String s = sc.nextLine();
            System.out.println("Enter age");
            int a = sc.nextInt();
            System.out.println("Eneter salary");
            int sl = sc.nextInt();

            User obj = new User();
            obj.setfirstname(f);
            obj.setsecondname(s);
            obj.setage(a);
            obj.setsalary(sl);
            System.out.print(obj.getfirstname() + "  ");
            System.out.println(obj.getsecondname());
            obj.isvalidage(a);

        }
    }
