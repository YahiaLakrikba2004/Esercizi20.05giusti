public class Esercizio1 {


    public static int moltiplica(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;


        int risultato = moltiplica(num1, num2);
        System.out.println("Il prodotto di " + num1 + " e " + num2 + " è: " + risultato);
    }
}
