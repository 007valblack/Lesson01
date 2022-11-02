import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a three number: ");
        int num1 = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a four number: ");
        int num2 = in.nextInt();

        System.out.printf("Your number: %d \n", num1 - num2);
        in.close();
    }
}
