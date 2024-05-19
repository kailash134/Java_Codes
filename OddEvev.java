import java.util.Scanner;

public class OddEvev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd even program:");
        System.out.println("enter the number: ");
        int num=input.nextInt();
        if (num % 2 == 0) {
            System.out.println("this is even num. ");
        }else {
            System.out.println("this is odd num. ");
        }

    }
}
