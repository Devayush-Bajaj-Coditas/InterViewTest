package WeekTest;

import java.util.Scanner;

public class UserChoice {
    int selection;
    StudentOperations studentOperations = new StudentOperations();
    Scanner s = new Scanner(System.in);
    void choice(){
        System.out.println("Press\n 1)Insert\n 2)Update\n 3)Remove\n 4)Fetch All\n5)Exit \nEnter: ");

        selection = s.nextInt();
    }
    void menu(){

            switch (selection){
                case 1 :
                    studentOperations.insert();
                case 2:
                    studentOperations.update();
                case 3:
                    studentOperations.remove();
                case 4:
                    studentOperations.fetch();
                case 5:
                    studentOperations.exit();
            }


    }

}
