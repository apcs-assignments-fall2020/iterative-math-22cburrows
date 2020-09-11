import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double act = x;
        double guess = 5.0;
        while (act - guess > 0.00001){
            double m = (guess + (x/guess)) / 2;
            act = (act + guess) / 2;
            guess = x / act;
        }
        return guess;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++){
            fact = fact * i;
        }
        return fact;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        for (int i = 0; i < 30; i++){
            e = e + (1/ (double) factorial(i));
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number!");
        double number = scan.nextDouble();

        System.out.println("The squareroot of " + number + " is " + babylonian(number));
        System.out.println("The value of e is roughly : " + calculateE());



        

        scan.close();
    }
}
