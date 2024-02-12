package day_01.conditionalsStt;

import java.util.Scanner;

public class sol_02 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp= sc.nextDouble();
//        double temp=103.5; // temperature
        if (temp>100){
            System.out.println("You have fever");
        }else {
            System.out.println("You don't have fever.");
        }
    }
}
