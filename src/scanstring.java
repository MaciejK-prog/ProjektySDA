import java.util.Scanner;
public class scanstring {
    public static void main(String[] args) {
        String listaProduktow = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=5 ; i++) {
            System.out.println("Podaj nazwe produktu " );
            String produkt = sc.next();
            //   System.out.println("Dodano produkt "+produkt);
            listaProduktow+=produkt;
            if (i<5) {
                listaProduktow += ", ";
            }
        }
        System.out.println("Lista zakupów: "+listaProduktow);
    }
}