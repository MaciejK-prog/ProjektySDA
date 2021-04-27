import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int liczba = 1;
        do {
            liczba = sc.nextInt();
            suma+=liczba;
            System.out.println(suma); }

            while (liczba != 0 );
            System.out.println("Suma Twoich liczb to:" + suma);
    }
}