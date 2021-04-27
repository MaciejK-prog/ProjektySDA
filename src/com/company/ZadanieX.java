import java.util.Scanner;
class ZadanieX {
    public static void main(String[] args){

        System.out.println("podaj liczbę, znak działania oraz drugą liczbę");

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        System.out.println("podaj rodzaj działania");

        String c = sc.next();

        System.out.println("podaj drugą liczbę");

        double b = sc.nextDouble();



        switch (c){
            case "+" : {
                System.out.println( a + b);
                        break; }
            case "-" : {
                System.out.println(a - b);
                break; }
            case "*" : {
                System.out.println( a * b);
                break; }
            case "/" : {
                System.out.println( a / b);
                break; }
            case "?":{
                System.out.println(Math.pow(a,b));
                break;
            }
            case "^":{
                System.out.println(Math.pow(a,(1/b)));
                break;
            }
            default: {
                System.out.println("błędny znak");
                break;
            }
        }


    }

}