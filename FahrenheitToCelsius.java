import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your temp in F: ");
        double a=input.nextDouble();


        double tem = (a - 32) * 5 / 9;
        System.out.println("TEMPERATURE IN CELSIUS: "+tem);

    }
}
