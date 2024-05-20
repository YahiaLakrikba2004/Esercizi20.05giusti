public class Esercizio2 {

    public static String concatena(String str, int num) {
        return str + num;
    }


    public static void main(String[] args) {
        String testo = "Numero: ";
        int numero = 42;

        String risultato = concatena(testo, numero);
        System.out.println("La concatenazione della stringa e del numero è: " + risultato);
    }
}
