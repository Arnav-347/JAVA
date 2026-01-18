import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r,circumference,area,volume;

        System.out.print("Enter the radius of circle in cm");
        r = scanner.nextDouble();

        circumference = 2*Math.PI*r;
        area = Math.PI*Math.pow(r,2);
        volume=4/3*Math.PI*Math.pow(r,3);

        System.out.printf("Circumference of circle = %.1fcm\n" , circumference  );
        System.out.println("Area of circle = " + area + "cm²");
        System.out.println("Volume of Sphere = " + volume + "cm³" );
        scanner.close();
    }
}
