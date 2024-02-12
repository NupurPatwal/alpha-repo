package day_01.dataTypes;

import java.util.Scanner;

public class sol_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();// first number
        System.out.println("Enter the second number");
        int b= sc.nextInt();// second number
        System.out.println("Enter the third number:");
        int c= sc.nextInt();// Third number
        System.out.println("The average is :"+ (a+b+c)/3);
    }
}
