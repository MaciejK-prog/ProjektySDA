import java.util.Scanner;
public class kolejnywhile {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę ");
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int liczba = 1;
        while (liczba != 0 ) {
            liczba = sc.nextInt();
            System.out.println(liczba);
            suma+=liczba;
            System.out.println(suma);
        }

        if (suma!=0)
            System.out.println("Suma tych liczb to: "+suma);
    }
}