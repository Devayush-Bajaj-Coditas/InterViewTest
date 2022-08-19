package WeekTest;

import java.util.Scanner;

public class StudentOperations {
StudentOperations studentOperations = new StudentOperations();
    int noOfStudents;
    Student student [] = new Student[5];
    Scanner s =new Scanner(System.in);
    void insert(){
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
        Student spp = new Student();
        for(int i =0 ; i< student.length -1 ; i++){
            if(student[i].equals(removeId)){
              spp=student[i];
              break;
            }
        }
        spp.id = 0;
        spp.firstName = null;
        spp.lastName =null;
        spp.city = null;
    }
    void fetch(){

    }
    void exit(){

    }

}
