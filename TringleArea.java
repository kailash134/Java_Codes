import java.util.Scanner;

public class TringleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcom to area calculator");
        System.out.println("Enter your base in cm: ");
        double base= input.nextDouble();
        System.out.println("enter your perpendicular hight in cm: ");
        double hight=input.nextDouble();

        double area=0.5*base*hight;
        System.out.println("THE AREA OF YOUR TRINGLE IS:"+area +"cms");

    }
}
