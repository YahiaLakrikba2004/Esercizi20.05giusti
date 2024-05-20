import java.util.Scanner;

public class Esercizio4 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        String[] stringhe = new String[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Inserisci la stringa " + (i + 1) + ":");
            stringhe[i] = scanner.nextLine();
        }


        String concatenazioneDiretta = stringhe[0] + stringhe[1] + stringhe[2];


        String concatenazioneInversa = stringhe[2] + stringhe[1] + stringhe[0];


        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneDiretta);
        System.out.println("Concatenazione in ordine inverso di inserimento: " + concatenazioneInversa);


        scanner.close();
    }
}
