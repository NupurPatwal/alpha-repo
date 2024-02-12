package day_01.dataTypes;

import java.util.Scanner;

public class sol_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The cost of pencil is: ");
        float pencil=sc.nextFloat();
        System.out.println("The cost of pen is: ");
        float pen= sc.nextFloat();
        System.out.println("The cost of erasor is: ");
        float erasor= sc.nextFloat();
        float totalCost= (pen+ pencil+ erasor)+ (pencil+pen + erasor)*0.18f;
        //printing the total cost :
        System.out.println("The total cost is "+ totalCost);
    }
}
