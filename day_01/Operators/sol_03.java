package day_01.Operators;

public class sol_03 {
    public static void main(String[] args) {

                int x, y, z;
                x = y = z = 2;
                x += y;
                y -= z;
                z /= (x + y);
                System.out.println(x + " " + y + " " + z);
            }
        }