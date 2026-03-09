package conditionalJava;

import java.util.Scanner;

public class seriesExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of i: ");
        int i = sc.nextInt();
        int sum = 0;
        int count = 1;
        do {
            sum = sum + count;
            count++;
        } while (count <= i);
        System.out.println("Sum of series : " + sum);
    }
}