import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         int sum1 = 0;
         int sum2 = 0;

    for (int i = 0; i <= 100; i += 2)
        sum1 += i;

    for (int i = 1; i <= 100; i += 2)
        sum2 += i;

        System.out.println(sum1);
        System.out.println(sum2);
    }
       public static Scanner in = new Scanner(System.in);
}
