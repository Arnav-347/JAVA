import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal,rate;
        int timesCompound;
        int years;
        double Amount;
        
        
        System.out.print("Enter the principal amount:");
        principal=scanner.nextDouble();
        
        System.out.print("Enter the interest rate (in %)");
        rate = scanner.nextDouble() / 100;
        
        System.out.print("Enter the number of times compounded each year");
        timesCompound = scanner.nextInt();
        
        System.out.print("Enter duration");
        years = scanner.nextInt();

        Amount = principal*Math.pow(1 + (rate/timesCompound),timesCompound*years);
        System.out.println("Total amount after " + years  + " is: " + Amount);
        
        
        
        scanner.close();   
    }
}
