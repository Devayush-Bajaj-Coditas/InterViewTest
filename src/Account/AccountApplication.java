package Account;

import java.rmi.server.UID;
import java.util.Random;
import java.util.Scanner;

class users{
    Scanner s = new Scanner(System.in);
    String name;
    int id;
    users(){
        System.out.println("Please enter your name :");
        name = s.nextLine();
        System.out.println("Please enter you id");
        id = s.nextInt();
    }

}
public class AccountApplication {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter number of employee");
        int employees = sca.nextInt();




        for (int i = 0; i<=employees; i++){
        }

    }
}
