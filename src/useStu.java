import java.util.Scanner;

public class useStu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please in put the name");
        String name=input.nextLine();
        System.out.println("Please in put the ID");
        int ID=input.nextInt();
        Student s1=new Student(name,ID);//instantiated object
        s1.showStu();//call member method
    }
}


class Student{
    String student1;//Create the variable of student
    int number;

    public Student(String s1, int n){
        this.student1=s1;
        this.number=n;
    }
    void showStu(){
        System.out.println("Name: "+student1+"\nID: "+number);//print the ID and the name
    }
}