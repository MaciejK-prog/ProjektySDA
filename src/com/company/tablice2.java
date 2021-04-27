public class tablice2 {
    public static void main(String[] args) {
        String[] tabStr = {"Adam", "Arek", "Ola", "Wiola", "Alex"};
        String sumaStr = "";
        for (String element : tabStr) {
            if (element.length() < 5)
                sumaStr = sumaStr + element + " ";
        }
        System.out.println(sumaStr);
    }
}