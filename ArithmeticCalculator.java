import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first=input.nextInt();
        System.out.println("Enter second number: ");
        int second=input.nextInt();

        int add=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;

        System.out.println("addition is:"+add);
        System.out.println("subtracttion is:"+sub);
        System.out.println("multiply is:"+mul);
        System.out.println("divitino is:"+div);
        System.out.println("mudulas is:"+mod);



    }
}
