import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = in.nextInt();
        int i = 1;

        while (i <= a) {
            if (a % i == 0)
                System.out.print(i + " ");
            i++;
        }

    }
    public static Scanner in = new Scanner(System.in);
}
