package day_01.Functions;

import java.util.Scanner;

public class sol_02 {
    public static boolean isEven(int n){ // parameter
        boolean isEven=true;
         if (n%2!=0){
             return false;
         }
         return isEven;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        System.out.println(isEven(n)); // arguments

    }
}
