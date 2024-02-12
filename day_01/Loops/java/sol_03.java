package day_01.Loops.java;

import java.util.Scanner;

public class sol_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fact=1;
        int num= sc.nextInt();
        for (int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
