import java.util.Scanner;

public class BasicOperations {
    /*
    Calcule as 4 operações basicas: soma, subtração, multiplicação e divisao.
    Sempre 2 valores devem ser passados.
     */
    public BasicOperations() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe qual operação deseja realizar digitando: ");
        System.out.println("1 para somar, 2 para subtrair, 3 para multiplicar ou 4 para dividir");

        int x;
        x = sc.nextInt();

        System.out.println("Voce informou: " + x);

        if (x == 1) {

            System.out.println("Informe os numeros a serem somados");
            int y;
            y = sc.nextInt();
            int z;
            z = sc.nextInt();
            int soma;
            soma = y + z;

            System.out.println("A soma de " + y + " e " + z + " é igual a: " + soma);
        } else if (x == 2) {

            System.out.println("Informe os numeros a serem subtraidos");
            int y;
            y = sc.nextInt();
            int z;
            z = sc.nextInt();
            int subtrair;
            subtrair = y - z;

            System.out.println("A subtração de " + y + " por " + z + " é igual a: " + subtrair);

        } else if (x == 3) {
            System.out.println("Informe os numeros a serem multiplicados");
            int y;
            y = sc.nextInt();
            int z;
            z = sc.nextInt();
            int multiplicar;
            multiplicar = y * z;

            System.out.println("A multiplicação de " + y + " por " + z + " é igual a: " + multiplicar);

        } else if (x == 4) {
            System.out.println("Informe os numeros a serem dividos");
            int y;
            y = sc.nextInt();
            int z;
            z = sc.nextInt();
            int dividir;
            dividir = y / z;

            System.out.println("A divisao de " + y + " por " + z + " é igual a: " + dividir);

        }

        sc.close();

    }
}
