import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        //HYPOTENUSE c=Math.sqrt(a² + b²)
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two sides of the triangle");

        a=scanner.nextDouble();
        b=scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        // System.out.println("HYPOTENUSE of triangle is: " + c + " units");
        System.out.print("c=" + c + " units");
        scanner.close();
    }
}
