package WeekTest;

import java.util.Scanner;

public class StudentOperations {
StudentOperations studentOperations = new StudentOperations();
    int noOfStudents;
    Scanner s =new Scanner(System.in);
    void insert(){
        System.out.println("Enter number of Students you want to insert");
        noOfStudents = s.nextInt();

        Student student [] = new Student[noOfStudents];
        for(int i = 0; i< student.length-1 ;i ++){
            student[i] = new Student(student[i].id,student[i].firstName,student[i].lastName,student[i].city,student[i].trackStack,student[i].mobileNo);
        }
    }

    void update(){
        System.out.println("Enter what you want to update \n" +
                "");
    }

    void remove(){
        System.out.println("Enter id which you want to remove");
        int removeId= s.nextInt();
    }
    void fetch(){

    }
    void exit(){

    }

}
