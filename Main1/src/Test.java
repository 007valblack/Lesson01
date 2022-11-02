import java.util.Scanner;

public class Test {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a max random number(0-100): ");
        int num = in.nextInt();
        int a = 0; // Начальное значение диапазона - "от"
        int b = num; // Конечное значение диапазона - "до"
        if (b>=0 && b<=100);
        int random_number1 = a + (int) (Math.random() * b); // Генерация числа
        System.out.println("Cлучайное число: " + random_number1);


    }
}
