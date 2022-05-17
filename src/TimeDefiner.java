import java.util.Scanner;

public class TimeDefiner {
    /*
    A partir da hora do dia, informe a menssagem adequada:
    - Bom dia, Boa tarde e boa noite.
     */
    public TimeDefiner() {
        System.out.println("Olá! Me informe que horas são agora, considerando: ");
        System.out.println("1 para periodo das 01h as 11h59, 2 para periodo das 12h00 as 17h59 e 3 para periodo das 18h as 00h59");

        Scanner sc = new Scanner(System.in);

        int periodo;
        periodo = sc.nextInt();

        if (periodo == 1) {
            System.out.println("Tenha um bom dia!");
        } else if (periodo == 2) {
            System.out.println("Tenha uma boa tarde!");
        } else if (periodo == 3) {
            System.out.println("Tenha uma boa noite!");
        }

        sc.close();
    }
}
