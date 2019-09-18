import java.util.*;


 class Member{
    String name;
    int age;
    int salary;
    Member(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Member Name"+ this.name);
        System.out.println("Member Age"+this.age);
        System.out.println("Member Salary"+this.salary);
    }

}
class MemberVariable{
    public static void main(String args[]){
    Member obj= new Member("Harry",45,2400);
    obj.display();

    }
}