import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] marks = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}
