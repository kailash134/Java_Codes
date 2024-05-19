import java.util.Scanner;

public class GreatestThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first num: ");
        int num1 = input.nextInt();
        System.out.println("enter the second num: ");
        int num2 = input.nextInt();
        System.out.println("enter the third num: ");
        int num3 = input.nextInt();


        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greatest num");

        }else if (num2>=num3) {
            System.out.println(num2 + "is greatest num");
        }else{
            System.out.println(num3 +"is greatest num");


        }

    }

}
