import java.util.Scanner;
public class silnnia {
    public static void main(String[] args) {
        int a, b=1;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for (int i = 1; i<=a; i++)
        {
            b *= i;
        }
        System.out.println(b);
    }
}