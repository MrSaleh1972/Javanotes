
import java.util.Scanner;
import java.time.Clock;



public class SimpleInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");

        double principal = input.nextDouble();

        System.out.print("Enter rate of interest: ");

        double rate = input.nextDouble();

        System.out.print("Enter time period in years: ");

        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        System.out.println("Mannen ");




        input.close();

    }

}
