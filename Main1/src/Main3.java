import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a five number: ");
        int num3 = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a six number: ");
        int num4 = in.nextInt();

        System.out.printf("Your number: %d \n", num3 * num4);
        in.close();
    }
}
