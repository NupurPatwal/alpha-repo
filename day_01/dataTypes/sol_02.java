package day_01.dataTypes;

import java.util.Scanner;

public class sol_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int side= sc.nextInt();
        int area= side * side;
        System.out.println("The area of the square is "+ area + " sq.unit");
    }
}
