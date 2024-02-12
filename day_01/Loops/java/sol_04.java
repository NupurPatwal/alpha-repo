package day_01.Loops.java;

import java.util.Scanner;

public class sol_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();
//        int n=1;
        //outer loop:
        for (int i=1; i<=10;i++){
            System.out.println(num + " * "+i+" = "+num*i);
        }
    }
}
