import java.util.Scanner;
class nowedzielnikifor {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();

        for(int i = 1; i<=liczba ; i++ ) {

            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}