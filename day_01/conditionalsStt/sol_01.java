package day_01.conditionalsStt;

import java.util.Scanner;

public class sol_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Integer number: ");
        int number= sc.nextInt();
        if (number>0){
            System.out.println("This is a positive number");
        }else {
            System.out.println("This is a negative number.");
        }
    }
}
